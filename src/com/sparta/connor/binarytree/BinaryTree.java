package com.sparta.connor.binarytree;

import com.sparta.connor.exceptions.ChildNotFoundException;

import java.util.ArrayList;

public class BinaryTree implements BinaryTreeable{

    private final Node rootNode;

    public BinaryTree(final int number) {
        this.rootNode = new Node(number);
    }

    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        return getChild(element, true);
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        return getChild(element, false);
    }

    private int getChild(int element, boolean leftChild) throws ChildNotFoundException {
        Node node = findNode(element);
        Node child;

        if(leftChild) {
            child = node.getLeftChild();
        } else {
            child = node.getRightChild();
        }

        if(child == null)
            throw new ChildNotFoundException();
        else
            return child.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return getSortedTreeAsc().length;
    }

    @Override
    public void addElement(int element) {
        addNodeToTree(rootNode, element);
    }

    @Override
    public void addElements(int[] elements) {
        for(int element : elements) {
            addElement(element);
        }
    }

    @Override
    public boolean findElement(int value) {
        Node node = findNode(value);

        if(node != null) {
            return true;
        }
        return false;
    }

    @Override
    public int[] getSortedTreeAsc() {

        ArrayList<Integer> sortedList = new ArrayList<>();
        inOrderTraversal(rootNode, sortedList);

        int[] sortedArray = new int[sortedList.size()];

        for(int i = 0; i < sortedList.size(); i ++) {
            sortedArray[i] = sortedList.get(i);
        }

        return sortedArray;

    }

    private void inOrderTraversal(Node node, ArrayList<Integer> values) {

        if(node == null) {
            return;
        }

        inOrderTraversal(node.getLeftChild(), values);
        values.add(node.getValue());
        inOrderTraversal(node.getRightChild(), values);

    }


    //TODO: implement
    @Override
    public int[] getSortedTreeDesc() {
        return new int[0];
    }

    //Recursive
    //code used to add an element is useful elsewhere
    private void addNodeToTree(Node node, int number) {
        if(number == node.getValue()) return;

        if(number <= node.getValue()) {
            if(node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(number));
            }
            else {
                addNodeToTree(node.getLeftChild(), number);
            }
        } else if(number > node.getValue()) {
            if(node.isRightChildEmpty()) {
                node.setRightChild(new Node(number));
            }
            else {
                addNodeToTree(node.getRightChild(), number);
            }
        }
    }

    private Node findNode(final int number) {
        Node node = rootNode;

        while(node != null) {
            if(number == node.getValue()) {
                return node;
            } else if (number < node.getValue()) {
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        return null;
    }
}

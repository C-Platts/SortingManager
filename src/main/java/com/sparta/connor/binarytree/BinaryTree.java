package com.sparta.connor.binarytree;

import com.sparta.connor.exceptions.ChildNotFoundException;
import com.sparta.connor.util.ListToArrayConverter;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class BinaryTree implements BinaryTreeable{

    private static final Logger logger = Logger.getLogger("SortManager");

    private Node rootNode;

    public BinaryTree() {}

    public BinaryTree(int rootElement) {
        this.rootNode = new Node(rootElement);
    }

    @Override
    public int getRootElement() {
        if(rootNode == null) {
            logger.error("Root node not initialised");
            return Integer.MIN_VALUE;
        }


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

        if(child == null) {
            logger.error("Child not found");
            throw new ChildNotFoundException("Child not found");
        } else
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

        if(elements.length < 1)
            return;

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
        inOrderTraversal(rootNode, sortedList, true);

        return ListToArrayConverter.listToArray(sortedList);

    }

    @Override
    public int[] getSortedTreeDesc() {
        ArrayList<Integer> sortedList = new ArrayList<>();
        inOrderTraversal(rootNode, sortedList, false);

       return ListToArrayConverter.listToArray(sortedList);
    }

    //Recursive
    //code used to add an element is useful elsewhere
    private void addNodeToTree(Node node, int number) {
        if(node == null) {
            rootNode = new Node(number);
            return;
        }

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

    private void inOrderTraversal(Node node, ArrayList<Integer> values, boolean left) {

        if(node == null) {
            return;
        }

        if(left) {
            inOrderTraversal(node.getLeftChild(), values, true);
            values.add(node.getValue());
            inOrderTraversal(node.getRightChild(), values, true);
        } else {
            inOrderTraversal(node.getRightChild(), values, false);
            values.add(node.getValue());
            inOrderTraversal(node.getLeftChild(), values, false);
        }
    }
}

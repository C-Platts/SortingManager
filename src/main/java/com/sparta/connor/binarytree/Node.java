package com.sparta.connor.binarytree;

public class Node {

    private Node leftChild;
    private Node rightChild;
    private final int value;

    public Node(int value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public int getValue() {
        return value;
    }

    public boolean isLeftChildEmpty() {
        //Same as right child, but is it readable?
        return leftChild == null;
    }

    public boolean isRightChildEmpty() {
        if(rightChild == null) {
            return true;
        } else {
            return false;
        }
    }

}

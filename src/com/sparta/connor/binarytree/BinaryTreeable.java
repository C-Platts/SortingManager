package com.sparta.connor.binarytree;

//TODO: Create custom exception
//import com.sparta.kwd.starter.exceptions.ChildNotFoundException;

import com.sparta.connor.exceptions.ChildNotFoundException;

public interface BinaryTreeable {
    int getRootElement();

    int getNumberOfElements();

    void addElement(int element);

    void addElements(int[] elements);

    boolean findElement(int value);

    //TODO: Create custom exception
    int getLeftChild(int element) throws ChildNotFoundException;

    //TODO: Create custom exception
    int getRightChild(int element) throws ChildNotFoundException;

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();
}

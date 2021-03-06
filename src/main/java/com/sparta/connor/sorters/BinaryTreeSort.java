package com.sparta.connor.sorters;

import com.sparta.connor.binarytree.BinaryTree;

public class BinaryTreeSort implements Sorter{
    @Override
    public int[] sortArray(int[] arrayToSort) {

        BinaryTree binaryTree = new BinaryTree();
        //Beginning at 1 since element 0 is already the root of the tree
        binaryTree.addElements(arrayToSort);

        return binaryTree.getSortedTreeAsc();
    }
}

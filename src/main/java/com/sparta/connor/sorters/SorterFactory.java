package com.sparta.connor.sorters;

public class SorterFactory {

    public static Sorter getSorter(int selection) {

        switch(selection) {
            case 1:
                return new BubbleSort();
            case 2:
                return new MergeSort();
            case 3:
                return new BinaryTreeSort();
            default:
                return null;
        }

    }

}

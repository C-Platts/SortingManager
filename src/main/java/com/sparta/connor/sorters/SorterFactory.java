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
            case 4:
                return new QuickSort();
            case 5:
                return new InsertionSort();
            case 6:
                return new SelectionSort();
            default:
                return null;
        }

    }

}

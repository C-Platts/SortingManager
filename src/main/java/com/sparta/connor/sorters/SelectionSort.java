package com.sparta.connor.sorters;

import com.sparta.connor.util.SorterUtil;

public class SelectionSort implements Sorter{
    @Override
    public int[] sortArray(int[] arrayToSort) {
        return selectionSort(arrayToSort);
    }

    private int[] selectionSort(int[] arrayToSort) {

        for(int i = 0; i < arrayToSort.length - 1; i ++) {

            int sortedIndex = i;

            for(int j = i + 1; j < arrayToSort.length; j ++) {
                if(arrayToSort[j] < arrayToSort[sortedIndex]) {
                    sortedIndex = j;
                }
            }

            int temp = arrayToSort[sortedIndex];
            arrayToSort[sortedIndex] = arrayToSort[i];
            arrayToSort[i] = temp;
        }

        return arrayToSort;
    }
}

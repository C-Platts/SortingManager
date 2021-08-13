package com.sparta.connor.sorters;

import com.sparta.connor.util.SorterUtil;

public class InsertionSort implements Sorter{
    @Override
    public int[] sortArray(int[] arrayToSort) {
        if(arrayToSort.length <= 1) {
            return arrayToSort;
        }

        return insertionSort(arrayToSort);
    }

    private int[] insertionSort(int[] arrayToSort) {

        for(int i = 0; i < arrayToSort.length; i ++) {

           int current = arrayToSort[i];

           int j = i - 1;

           //Shift element towards the front
           while(j >= 0 && arrayToSort[j] > current) {
               arrayToSort[j + 1] = arrayToSort[j];
               j -= 1;
           }
           arrayToSort[j + 1] = current;

        }

        return arrayToSort;

    }
}

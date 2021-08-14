package com.sparta.connor.sorters;

import com.sparta.connor.util.SorterUtil;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class QuickSort implements Sorter{

    private static Logger logger = Logger.getLogger("SortManager");

    @Override
    public int[] sortArray(int[] arrayToSort) {

        if(arrayToSort.length <= 1)
            return arrayToSort;

        return quickSort(arrayToSort, 0, arrayToSort.length - 1);
    }

    private int[] quickSort(int[] arrayToSort, int low, int high) {


        if(low < high)
        {

            int pivotIndex = partition(arrayToSort, low, high);

            quickSort(arrayToSort, low, pivotIndex - 1);
            quickSort(arrayToSort, pivotIndex + 1, high);

        }

        return arrayToSort;
    }

    private int partition(int[] arrayToSort, int low, int high) {

        int pivot = arrayToSort[high];
        int i = (low - 1);
        int temp;

        for(int j = low; j <= high; j ++) {
            if(arrayToSort[j] < pivot) {

                i ++;

                temp = arrayToSort[i];
                arrayToSort[i] = arrayToSort[j];
                arrayToSort[j] = temp;

            }
        }

        temp = arrayToSort[i + 1];
        arrayToSort[i + 1] = arrayToSort[high];
        arrayToSort[high] = temp;

        return (i + 1);
    }
}

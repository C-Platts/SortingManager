package com.sparta.connor.sorters;


public class MergeSort implements Sorter{

   // private static Logger logger = new Logger("SortManager");

    @Override
    public int[] sortArray(int[] arrayToSort) {
        if(arrayToSort.length <= 1) {
            return arrayToSort;
        }

        return split(arrayToSort);
    }

    private int[] split(int[] arr) {

        if(arr.length <= 1)
            return arr;

        int[] left = new int[arr.length/2];
        int[] right = new int[arr.length - left.length];

        for(int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }

        for(int i = 0; i < right.length; i++) {
            right[i] = arr[ (arr.length / 2)+  i];
        }

        left = split(left);
        right = split(right);

        return merge(left, right);

    }

    private int [] merge(int[] left, int[] right) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] mergeArray = new int[left.length + right.length];

        while(i < left.length && j < right.length) {

            if(left[i] <= right[j]) {
                mergeArray[k] = left[i];
                i ++;
            } else {
                mergeArray[k] = right[j];
                j ++;
            }
            k ++;
        }

        //Left or right might still have elements in them - need to append
        if(i < left.length - 1) {
            //Pass in the index to continue from where the above algorithm left off
            consumearray(left, mergeArray, i);
        } else if(j < right.length - 1) {
            consumearray(right, mergeArray, j);
        }

        return mergeArray;

    }

    private int[] consumearray(int[] array, int[] mergeArray, int i) {
        //Copy elements from array to mergeArray
        for(int j = i; j < array.length; j ++) {
            mergeArray[j] = array[j];
        }
        return mergeArray;
    }

}

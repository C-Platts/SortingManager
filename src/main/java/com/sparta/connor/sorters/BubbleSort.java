package com.sparta.connor.sorters;

public class BubbleSort implements Sorter{

    //user can also input a sorted array
    @Override
    public int[] sortArray(int[] arrayToSort) {

        int limit = arrayToSort.length - 1;
        int temp;
        boolean sorted;


        //Run through array for each element within
        for(int number : arrayToSort) {

            sorted = true;

            //Run through array
            for(int i = 0; i < limit; i++) {

                if(arrayToSort[i] > arrayToSort[i+1]) {

                    //Store value to be swapped in temporary space
                    temp = arrayToSort[i+1];

                    //Swap values
                    arrayToSort[i+1] = arrayToSort[i];
                    arrayToSort[i] = temp;

                    sorted = false;
                }

            }

            //If no swaps have been made during a run through, the array is sorted
            if(sorted)
                break;

            //Reduce upper limit of search since the upper end of the array will be sorted
            limit --;

        }

        return arrayToSort;
    }
}

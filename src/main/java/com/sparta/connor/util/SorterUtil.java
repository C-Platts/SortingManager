package com.sparta.connor.util;

import java.util.ArrayList;

public class SorterUtil {

    public static int[] listToArray(ArrayList<Integer> list) {

        int[] array = new int[list.size()];

        for(int i = 0; i < list.size(); i ++) {
            array[i] = list.get(i);
        }

        return array;

    }

    public static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

}

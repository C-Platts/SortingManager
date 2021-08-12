package com.sparta.connor.util;

import java.util.ArrayList;

public class ListToArrayConverter {

    public static int[] listToArray(ArrayList<Integer> list) {

        int[] array = new int[list.size()];

        for(int i = 0; i < list.size(); i ++) {
            array[i] = list.get(i);
        }

        return array;

    }

}

package com.sparta.connor.arraygenerator;

public class ArrayGenerator {

    public int[] generate(int length) {

        if(length <= 0)
            length = 1;

        return generateRandomValueSet(new int[length], 1, length);
    }

    private int generateRandomValue(int max, int min) {

       return (int) Math.floor(Math.random()*(max-min+1)+min);
    }

    private int[] generateRandomValueSet(int[] array, int max, int min) {

        for(int i = 0; i < array.length; i ++) {
            array[i] = generateRandomValue(max, min);
        }
        return array;
    }
}

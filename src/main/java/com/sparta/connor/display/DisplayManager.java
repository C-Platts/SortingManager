package com.sparta.connor.display;

import com.sparta.connor.sorters.Sorter;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayManager {

    public void printGreeting() {
        System.out.println("Sorting Algorithms available:");
        System.out.println("1. Bubble sort");
        System.out.println("2. Merge sort");
        System.out.println("3. Binary Tree sort");
        System.out.println("4. Quick sort");
        System.out.println("5. Insertion sort");
        System.out.println("6. Selection sort");

    }

    public void printArraySelection() {
        System.out.println("Please enter an integer length for an array you would like to sort:");
    }

    public void outputPreSortedArray(int[] array) {
        System.out.println("Randomly generated array: " + Arrays.toString(array));
    }

    public void outputPostSortedArray(int[] array, Sorter sorter) {
        System.out.println("Sorted by " + sorter.getClass().getSimpleName() + ": " + Arrays.toString(array));
    }

    public void outputTimeTaken(double time) {
        System.out.println("Completed in: " + time + " milliseconds");
    }

    public void printSortSelection() {
        System.out.println();
    }

}

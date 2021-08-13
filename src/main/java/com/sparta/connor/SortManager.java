package com.sparta.connor;

import com.sparta.connor.arraygenerator.ArrayGenerator;
import com.sparta.connor.display.DisplayManager;
import com.sparta.connor.display.InputManager;
import com.sparta.connor.sorters.Sorter;
import com.sparta.connor.sorters.SorterFactory;

public class SortManager {

    DisplayManager displayManager = new DisplayManager();
    InputManager inputManager = new InputManager();
    ArrayGenerator arrayGenerator = new ArrayGenerator();

    public void load() {

        displayManager.printGreeting();
        Sorter sorter = SorterFactory.getSorter(inputManager.getUserInput());
        displayManager.printArraySelection();

        int length = inputManager.getUserInput();
        int[] array = arrayGenerator.generate(length);

        displayManager.outputPreSortedArray(array);

        //output name of sorting algorithm



        //begin timer
        double start = System.nanoTime();

        try {
            array = sorter.sortArray(array);
        } catch (NullPointerException n) {
            n.printStackTrace();
            System.exit(1);
        }

        //stop timer
        double end = System.nanoTime();

        displayManager.outputPostSortedArray(array, sorter);

        //From nanoseconds to milliseconds
        displayManager.outputTimeTaken((end - start) / 100);



    }

}

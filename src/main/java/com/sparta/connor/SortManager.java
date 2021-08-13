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

        displayManager.outputArray(array);

        //output name of sorting algorithm

        //begin timer
        double start = System.nanoTime();
        array = sorter.sortArray(array);
        //stop timer
        double end = System.nanoTime();

        displayManager.outputArray(array);
        displayManager.outputTimeTaken(end - start);



    }

}

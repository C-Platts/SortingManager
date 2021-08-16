package performance;

import com.sparta.connor.SortManager;
import com.sparta.connor.arraygenerator.ArrayGenerator;
import com.sparta.connor.display.DisplayManager;
import com.sparta.connor.display.InputManager;
import com.sparta.connor.sorters.Sorter;
import com.sparta.connor.sorters.SorterFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Logger;

public class PerformanceTests {

    private static ArrayGenerator arrayGenerator;
    private static Sorter sorters[];
    private static int[][] arrays;

    private static final int arrayLength = 1000;

    private static final Logger logger = Logger.getLogger("SortManager");

    @BeforeAll
    static void setup() {
        arrayGenerator = new ArrayGenerator();

        sorters = new Sorter[6];
        arrays = new int[6][];

        //Get an array of each sorter type
        //Initialise the same number of arrays to sort
        for(int i = 1; i <= 6; i ++) {
            sorters[i - 1] = SorterFactory.getSorter(i);
            arrays[i - 1] = arrayGenerator.generate(1000);
        }
    }

    @Test
    public void testSorthingSpeeds() {

        double[] results = getTimes(sorters, arrays);

        //merge sort should be faster than bubble
        Assertions.assertTrue(results[1] < results[0]);



    }

    private double getTime(Sorter sorter, int[] array) {
        double start = System.nanoTime();
        sorter.sortArray(array);
        double end = System.nanoTime();
        return end - start;
    }

    private double[] getTimes(Sorter[] sorters, int[][] arrays) {
        double[] times = new double[6];

        for(int i = 0; i < 6; i ++) {
            times[i] = getTime(sorters[i], arrays[i]);
        }

        logger.info("Bubble sort time: " + times[0]);
        logger.info("Merge sort time: " + times[1]);
        logger.info("Binary Tree sort time: " + times[2]);
        logger.info("Quick time: " + times[3]);
        logger.info("Insertion sort time: " + times[4]);
        logger.info("Selection sort time: " + times[5]);


        return times;
    }


}

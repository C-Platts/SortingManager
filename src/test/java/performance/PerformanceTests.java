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
    private static int[] array1, array2;

    private static final int arrayLength = 1000;

    private static Logger logger = Logger.getLogger("SortManager");

    @BeforeAll
    static void setup() {
        arrayGenerator = new ArrayGenerator();

        //two arrays of the same length
        array1 = arrayGenerator.generate(arrayLength);
        array2 = arrayGenerator.generate(arrayLength);
    }

    @Test
    public void testMergeSortIsFasterThanJavaSort() {
        double javaSortTime;
        double arraySortTime;

        Sorter sorter = SorterFactory.getSorter(2);

        double[] results = getTimes(sorter);

        Assertions.assertTrue(results[0] < results[1]);

    }

    @Test
    public void testBubbleSortIsSlowerThanJavaSort() {


        Sorter sorter = SorterFactory.getSorter(1);

        double[] results = getTimes(sorter);

        Assertions.assertFalse(results[0] < results[1]);

    }

    private double[] getTimes(Sorter sorter) {
        double javaSortTime;
        double arraySortTime;

        double start = System.nanoTime();
        sorter.sortArray(array1);
        double end = System.nanoTime();

        arraySortTime = end - start;

        start = System.nanoTime();
        Arrays.sort(array2);
        end = System.nanoTime();
        javaSortTime = end - start;

        logger.info("Array sort time: " + arraySortTime);
        logger.info("Java sort time: " + javaSortTime);

        return new double[]{arraySortTime, javaSortTime};
    }


}

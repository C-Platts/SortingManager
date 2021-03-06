package sorter;

import com.sparta.connor.sorters.MergeSort;
import com.sparta.connor.sorters.Sorter;
import com.sparta.connor.sorters.SorterFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.logging.Logger;

public class SorterTest {

    private static Sorter sorter;
    private static Logger logger = Logger.getLogger("SortManager");

    @BeforeAll
    static void setupFactory() {
        //BubbleSort
        //sorter = SorterFactory.getSorter(1);

        //MergeSort
       sorter = SorterFactory.getSorter(2);

        //BinaryTreeSort
        //sorter = SorterFactory.getSorter(3);

        //QuickSort
        //sorter = SorterFactory.getSorter(4);

        //InsertionSort
        //sorter = SorterFactory.getSorter(5);

        //SelectionSort
        //sorter = SorterFactory.getSorter(6);

    }

    @Test
    public void SortDoesNotChangeASortedArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Assertions.assertEquals(
                Arrays.toString(array),
                Arrays.toString(sorter.sortArray(array))
        );

    }

    @Test
    public void SortSortsAnUnsortedArrayInAscendingOrder() {
        int[] array = {4, 7, 8, 1, 10, 6, 2, 3, 9, 5};

        Assertions.assertEquals(
                Arrays.toString( new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}),
                Arrays.toString(sorter.sortArray(array))
        );

        logger.info(Arrays.toString( new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        logger.info(Arrays.toString(sorter.sortArray(array)));
    }

    @Test
    public void SortDetectsAnEmptyArray() {
        int [] emptyArray = new int[0];

        Assertions.assertEquals(
                Arrays.toString(emptyArray),
                Arrays.toString(sorter.sortArray(emptyArray))
        );

    }

    @Test
    public void SortDetectsAnArrayWithOneValue() {
        int [] singleElement = {1};

        Assertions.assertEquals(
                Arrays.toString(singleElement),
                Arrays.toString(sorter.sortArray(singleElement))
        );

    }
}

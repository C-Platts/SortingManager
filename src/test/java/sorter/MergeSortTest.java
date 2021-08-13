package sorter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import com.sparta.connor.sorters.MergeSort;

public class MergeSortTest {

    @Test
    public void mergeSortDoesNotChangeASortedArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        MergeSort mergeSort = new MergeSort();

        Assertions.assertEquals(
                Arrays.toString(array),
                Arrays.toString(mergeSort.sortArray(array))
        );

    }

    @Test
    public void mergeSortSortsAnUnsortedArrayInAscendingOrder() {
        int[] array = {4, 7, 8, 1, 10, 6, 2, 3, 9, 5};

        MergeSort mergeSort = new MergeSort();

        Assertions.assertEquals(
                Arrays.toString( new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}),
                Arrays.toString(mergeSort.sortArray(array))
        );
    }

    @Test
    public void mergeSortDetectsAnEmptyArray() {
        int [] emptyArray = new int[14];

        MergeSort mergesort = new MergeSort();

        Assertions.assertEquals(
                Arrays.toString(emptyArray),
                Arrays.toString(mergesort.sortArray(emptyArray))
        );

    }

    @Test
    public void mergeSortDetectsAnArrayWithOneValue() {
        int [] emptyArray = {1};

        MergeSort mergesort = new MergeSort();

        Assertions.assertEquals(
                Arrays.toString(emptyArray),
                Arrays.toString(mergesort.sortArray(emptyArray))
        );

    }

}

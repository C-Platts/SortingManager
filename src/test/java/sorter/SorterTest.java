package sorter;

import com.sparta.connor.sorters.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

//TODO: Change to use Sort factory
public class SorterTest {

    @Test
    public void SortDoesNotChangeASortedArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        MergeSort mergeSort = new MergeSort();

        Assertions.assertEquals(
                Arrays.toString(array),
                Arrays.toString(mergeSort.sortArray(array))
        );

    }

    @Test
    public void SortSortsAnUnsortedArrayInAscendingOrder() {
        int[] array = {4, 7, 8, 1, 10, 6, 2, 3, 9, 5};

        MergeSort mergeSort = new MergeSort();

        Assertions.assertEquals(
                Arrays.toString( new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}),
                Arrays.toString(mergeSort.sortArray(array))
        );
    }

    @Test
    public void SortDetectsAnEmptyArray() {
        int [] emptyArray = new int[14];

        MergeSort mergesort = new MergeSort();

        Assertions.assertEquals(
                Arrays.toString(emptyArray),
                Arrays.toString(mergesort.sortArray(emptyArray))
        );

    }

    @Test
    public void SortDetectsAnArrayWithOneValue() {
        int [] emptyArray = {1};

        MergeSort mergesort = new MergeSort();

        Assertions.assertEquals(
                Arrays.toString(emptyArray),
                Arrays.toString(mergesort.sortArray(emptyArray))
        );

    }
}

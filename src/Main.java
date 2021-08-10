import com.sparta.connor.binarytree.BinaryTree;
import com.sparta.connor.binarytree.BinaryTreeable;
import com.sparta.connor.exceptions.ChildNotFoundException;
import com.sparta.connor.sorters.BubbleSort;
import com.sparta.connor.sorters.Sorter;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Sorter bs = new BubbleSort();
        int[] arrayToSort = {1, 13, 5, 2, 743, 9, 6, 31, 1, 9, 0, 34};

        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        System.out.println(Arrays.toString(arrayToSort) + "\n");

        System.out.println(Arrays.toString(bs.sortArray(arrayToSort)) + "\n");

        //---------------------------------------------
        BinaryTree binaryTree = new BinaryTree(7);

        int[] elements = {2, 8, 9, 4, 2, 5, 6, 7, 12, 64, 6798 ,345 ,243, 36, 78, 569, 45};

        binaryTree.addElements(elements);

        System.out.println(binaryTree.findElement(5));

        System.out.println(Arrays.toString(binaryTree.getSortedTreeAsc()));

        try {
            System.out.println(binaryTree.getLeftChild(5));
            System.out.println(binaryTree.getRightChild(5));
        } catch (ChildNotFoundException e) {
            e.printStackTrace();
        }

    }
}

package binarytree;

import com.sparta.connor.binarytree.BinaryTree;
import com.sparta.connor.exceptions.ChildNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BinaryTreeTest {

    @Test
    public void testConstructorInitialisesRootNode() {
        BinaryTree bt = new BinaryTree(7);

        Assertions.assertEquals(7, bt.getRootElement());

    }

    @Test
    public void testDefaultConstructorDoesNotInitialisesRootNode() {
        BinaryTree bt = new BinaryTree();

        Assertions.assertEquals(Integer.MIN_VALUE, bt.getRootElement());

    }

    //Tests addElement and findElement
    @Test
    public void testAddElementCreatesNewNode() {
        BinaryTree bt = new BinaryTree(7);

        bt.addElement(4);

        Assertions.assertTrue(bt.findElement(4));
    }

    @Test
    public void testAddingNodeToEmptyBinaryTreeInitialisesRootNode() {
        BinaryTree bt = new BinaryTree();

        bt.addElement(4);

        Assertions.assertEquals(4, bt.getRootElement());
    }

    @Test
    public void testGetLeftChildDoesNotThrowExceptionIfChildNodeExists() {
        BinaryTree bt = new BinaryTree(7);

        bt.addElement(4);

        try {
            Assertions.assertEquals(4, bt.getLeftChild(7));
        } catch (ChildNotFoundException e){
            e.printStackTrace();
            Assertions.fail();
        }
    }

    @Test
    public void testGetLeftChildDoesThrowExceptionIfChildNodeDoesNotExist() {
        BinaryTree bt = new BinaryTree(7);

        Assertions.assertThrows(ChildNotFoundException.class, () -> bt.getLeftChild(7), "Child not found");
    }

    @Test
    public void testGetRightChildDoesNotThrowExceptionIfChildNodeExists() {
        BinaryTree bt = new BinaryTree(7);

        bt.addElement(19);

        try {
            Assertions.assertEquals(19, bt.getRightChild(7));
        } catch (ChildNotFoundException e){
            e.printStackTrace();
            Assertions.fail();
        }
    }

    @Test
    public void testGetRightChildDoesThrowExceptionIfChildNodeDoesNotExist() {
        BinaryTree bt = new BinaryTree(7);

        Assertions.assertThrows(ChildNotFoundException.class, () -> bt.getRightChild(7), "Child not found");

    }

    @Test
    public void testBinaryTreeDoesNotPutDuplicateValuesOnTheRight() {
        BinaryTree bt = new BinaryTree(7);

        bt.addElement(7);

        Assertions.assertThrows(ChildNotFoundException.class, () -> bt.getRightChild(7), "Child not found");
    }

    @Test
    public void testBinaryTreePutsDuplicateValuesOnTheLeft() {
        BinaryTree bt = new BinaryTree(7);

        bt.addElement(7);

        try {
            Assertions.assertEquals(7, bt.getLeftChild(7));
        } catch (ChildNotFoundException e){
            e.printStackTrace();
            Assertions.fail();
        }
    }

    @Test
    public void testBinaryTreeAddsAllElementsInAnArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinaryTree bt = new BinaryTree();

        bt.addElements(array);

        Assertions.assertEquals(array.length, bt.getNumberOfElements());
    }

    @Test
    public void testBinaryTreeAddsAllElementsInAnArrayWhenUsingDefaultConstructor() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinaryTree bt = new BinaryTree(7);

        bt.addElements(array);

        Assertions.assertEquals(array.length + 1, bt.getNumberOfElements());
    }

    @Test
    public void testBinaryTreeOnlyAddsOneElementWhenUsingDefaultConstructor() {
        BinaryTree bt = new BinaryTree();

        bt.addElement(7);

        Assertions.assertEquals(1, bt.getNumberOfElements());
    }

    @Test
    public void testBinaryTreeOnlyAddsOneElement() {
        BinaryTree bt = new BinaryTree(7);
        bt.addElement(4);

        Assertions.assertEquals(2, bt.getNumberOfElements());
    }

    @Test
    public void testBinaryTreeCanFindValue() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinaryTree bt = new BinaryTree(7);

        bt.addElements(array);

        Assertions.assertTrue(bt.findElement(8));
    }

    @Test
    public void testBinaryTreeCanFindValueWhenUsingDefaultConstructor() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinaryTree bt = new BinaryTree();

        bt.addElements(array);

        Assertions.assertTrue(bt.findElement(8));

    }

    @Test
    public void testBinaryTreeCanNotFindAValueThatDoesNotExist() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinaryTree bt = new BinaryTree(7);

        bt.addElements(array);

        Assertions.assertFalse(bt.findElement(23));
    }

    @Test
    public void testBinaryTreeCanSortInAscendingOrderWhenGivenASortedArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        BinaryTree bt = new BinaryTree(7);

        bt.addElements(array);

        Assertions.assertEquals(
                Arrays.toString(new int[]{1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20}),
                Arrays.toString(bt.getSortedTreeAsc()));
    }

    @Test
    public void testBinaryTreeCanSortInAscendingOrderWhenGivenAnUnsortedArray() {
        int[] array = {7, 10, 3, 5, 9, 2, 8, 4, 6, 1};
        BinaryTree bt = new BinaryTree(7);

        bt.addElements(array);

        Assertions.assertEquals(
                Arrays.toString(new int[]{1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10}),
                Arrays.toString(bt.getSortedTreeAsc()));
    }

    @Test
    public void testBinaryTreeCanSortInDescendingOrderWhenGivenASortedArray() {
        int[] array = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        BinaryTree bt = new BinaryTree(7);

        bt.addElements(array);

        Assertions.assertEquals(
                Arrays.toString(new int[]{20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10,
            9, 8, 7, 7, 6, 5, 4, 3, 2, 1}),
                Arrays.toString(bt.getSortedTreeDesc()));
    }

    @Test
    public void testBinaryTreeCanSortInDescendingOrderWhenGivenAnUnsortedArray() {
        int[] array = {7, 10, 3, 5, 9, 2, 8, 4, 6, 1};
        BinaryTree bt = new BinaryTree(7);

        bt.addElements(array);

        Assertions.assertEquals(
                Arrays.toString(new int[]{10, 9, 8, 7, 7, 6, 5, 4, 3, 2, 1}),
                Arrays.toString(bt.getSortedTreeDesc()));
    }

    @Test
    public void testBinaryTreeCanSortInAscendingOrderWhenGivenASortedArrayWithDefaultConstructor() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        BinaryTree bt = new BinaryTree(7);

        bt.addElements(array);

        Assertions.assertEquals(
                Arrays.toString(new int[]{1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10,
                        11, 12, 13, 14, 15, 16, 17, 18, 19, 20}),
                Arrays.toString(bt.getSortedTreeAsc()));
    }

    @Test
    public void testBinaryTreeCanSortInAscendingOrderWhenGivenAnUnsortedArrayWithDefaultConstructor() {
        int[] array = {7, 10, 3, 5, 9, 2, 8, 4, 6, 1};
        BinaryTree bt = new BinaryTree();

        bt.addElements(array);

        Assertions.assertEquals(
                Arrays.toString(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}),
                Arrays.toString(bt.getSortedTreeAsc()));
    }

    @Test
    public void testBinaryTreeCanSortInDescendingOrderWhenGivenASortedArrayWithDefaultConstructor() {
        int[] array = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        BinaryTree bt = new BinaryTree();

        bt.addElements(array);

        Assertions.assertEquals(Arrays.toString(
                new int[]{20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10,
                9, 8, 7, 6, 5, 4, 3, 2, 1}),
                Arrays.toString(bt.getSortedTreeDesc()));
    }

    @Test
    public void testBinaryTreeCanSortInDescendingOrderWhenGivenAnUnsortedArrayWithDefaultConstructor() {
        int[] array = {7, 10, 3, 5, 9, 2, 8, 4, 6, 1};
        BinaryTree bt = new BinaryTree();

        bt.addElements(array);

        Assertions.assertEquals(
                Arrays.toString(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}),
                Arrays.toString(bt.getSortedTreeDesc()));
    }

}

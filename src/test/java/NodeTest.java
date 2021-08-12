import com.sparta.connor.binarytree.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NodeTest {

    //Tests constructor and getValue()
    @Test
    public void testConstructorInitialisesValue() {
        Node testNode = new Node(7);

        Assertions.assertEquals(testNode.getValue(), 7);
    }


    //tests setLeftChild() and getLeftChild()
    @Test
    public void testGetLeftChildReturnsNode() {
        Node testNode = new Node(7);
        Node testNodeLeftChild = new Node(4);

        testNode.setLeftChild(testNodeLeftChild);

        Assertions.assertEquals(testNode.getLeftChild(), testNodeLeftChild);
    }

    //tests setLeftChild() and getLeftChild() for null values
    @Test
    public void testGetLeftChildReturnsNull() {
        Node testNode = new Node(7);

        Assertions.assertNull(testNode.getLeftChild());
    }

    //tests setRightChild() and getRightChild()
    @Test
    public void testGetRightChildReturnsNode() {
        Node testNode = new Node(7);
        Node testNodeRightChild = new Node(4);

        testNode.setLeftChild(testNodeRightChild);

        Assertions.assertEquals(testNode.getRightChild(), testNodeRightChild);
    }

    //tests setRightChild() and getRightChild() for null values
    @Test
    public void testGetRightChildReturnsNull() {
        Node testNode = new Node(7);

        Assertions.assertNull(testNode.getRightChild());

    }


    //tests isLeftChildEmpty() and setLeftChild()
    @Test
    public void testIsLeftChildEmptyReturnsTrue() {
        Node testNode = new Node(7);
        Node testNodeLeftChild = new Node(4);

        testNode.setLeftChild(testNodeLeftChild);

        Assertions.assertTrue(testNode.isLeftChildEmpty());
    }

    //tests isLeftChildEmpty() and setLeftChild()
    @Test
    public void testIsLeftChildEmptyReturnsFalse() {
        Node testNode = new Node(7);

        Assertions.assertFalse(testNode.isLeftChildEmpty());
    }

    @Test
    public void testIsRightChildEmptyReturnsTrue() {
        Node testNode = new Node(7);
        Node testNodeRightChild = new Node(4);

        testNode.setRightChild(testNodeRightChild);

        Assertions.assertTrue(testNode.isRightChildEmpty());
    }

    @Test
    public void testIsRightChildEmptyReturnsFalse() {
        Node testNode = new Node(7);


        Assertions.assertFalse(testNode.isRightChildEmpty());
    }


}

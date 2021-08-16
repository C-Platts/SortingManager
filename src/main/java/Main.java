import com.sparta.connor.SortManager;
import com.sparta.connor.binarytree.BinaryTree;
import com.sparta.connor.binarytree.BinaryTreeable;
import com.sparta.connor.exceptions.ChildNotFoundException;
import com.sparta.connor.sorters.BubbleSort;
import com.sparta.connor.sorters.Sorter;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class Main {

    private static Logger logger = Logger.getLogger("SortManager");//Main.class.getName());

    public static void main(String[] args) {

        SortManager sm = new SortManager();
        sm.load();

    }
}

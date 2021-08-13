package display;

import com.sparta.connor.display.DisplayManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DisplayManagerTest {

    public static DisplayManager displaymanager;

    @BeforeAll
    static void setup() {
        displaymanager = new DisplayManager();
    }

}

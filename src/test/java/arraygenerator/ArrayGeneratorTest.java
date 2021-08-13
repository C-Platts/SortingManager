package arraygenerator;

import com.sparta.connor.arraygenerator.ArrayGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrayGeneratorTest {

    private static ArrayGenerator generator;

    @BeforeAll
    static void setupGenerator() {
        generator = new ArrayGenerator();
    }

    @Test
    public void testArrayIsGenerated() {
        int length = 5;

        Assertions.assertFalse(generator.generate(length).length == 0);
    }

    @Test
    public void testArrayGeneratedIsOfLefgthSpecified() {
        int length = 5;

        Assertions.assertTrue(generator.generate(length).length == 5);
    }

    @Test
    public void testSingleLengthArrayCanBeGenerated() {
        int length = 1;

        Assertions.assertTrue(generator.generate(length).length == 1);
    }

    @Test
    public void testZeroLengthArrayCannotBeGenerated() {
        int length = 0;
        Assertions.assertTrue(generator.generate(length).length == 1);
    }

    @Test
    public void testArrayElementsAreNotEmpty() {
        int length = 5;
        for(int number : generator.generate(length)) {
            Assertions.assertFalse(number == 0);
        }
    }

    @Test
    public coid testArrayOfAbsurdlyLargeSizeCanBenMade() {
        int length = Integer.MAX_VALUE;
        Assertions.assertTrue(generator.generate(length).length == length);
    }
}

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

        Assertions.assertNotEquals(0, generator.generate(length).length);
    }

    @Test
    public void testArrayGeneratedIsOfLefgthSpecified() {
        int length = 5;

        Assertions.assertEquals(5, generator.generate(length).length);
    }

    @Test
    public void testSingleLengthArrayCanBeGenerated() {
        int length = 1;

        Assertions.assertEquals(1, generator.generate(length).length);
    }

    @Test
    public void testZeroLengthArrayCannotBeGenerated() {
        int length = 0;
        Assertions.assertEquals(1, generator.generate(length).length);
    }

    @Test
    public void testArrayElementsAreNotEmpty() {
        int length = 458724597;
        for(int number : generator.generate(length)) {
            Assertions.assertNotEquals(0, number);
        }
    }
}

package school.mjc.stage0.loops.task5;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TriangleTest extends BaseIOTest {

    @Test
    void printTriangle() {
        String expected =
                """
                8   \s
                88  \s
                888 \s
                8888\s
                88888
                """;

        String expected2 =
                """
                8
                88
                888
                8888
                88888
                """;

        Triangle triangle = new Triangle();

        triangle.printTriangle(5);

        String checked = updateLineSpliterators(outContent.toString());

        assertTrue(expected.equals(checked) || expected2.equals(checked));

    }

    @Test
    void printTrianglePrintsMin() {
        String expected =
                """
                8 \s
                88\s
                888
                """;

        String expected2 =
                """
                8
                88
                888
                """;

        Triangle triangle = new Triangle();

        triangle.printTriangle(3);

        String checked = updateLineSpliterators(outContent.toString());

        assertTrue(expected.equals(checked) || expected2.equals(checked));

    }
}
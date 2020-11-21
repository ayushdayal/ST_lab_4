import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest_cyclo {

    private void createTriangleAndAssertValue(int i, int i1, int i2, String expectedValue) {
        try {
            String actualValue = Triangle.checkTriangle(i, i1, i2);
            assertEquals(expectedValue, actualValue);

        } catch (Exception e) {
            assertEquals(expectedValue, e.getMessage());
        }

    }


    @Test
    void checkTriangle_TC1() {
        createTriangleAndAssertValue(4, 1, 2, "not triangle");
    }

    @Test
    void checkTriangle_TC2() {
        createTriangleAndAssertValue(1, 4, 2, "not triangle");
    }

    @Test
    void checkTriangle_TC3() {
        createTriangleAndAssertValue(1, 2, 4, "not triangle");
    }

    @Test
    void checkTriangle_TC4() {
        createTriangleAndAssertValue(5, 5, 5, "equilateral triangle");
    }

    @Test
    void checkTriangle_TC5() {

    }

    @Test
    void checkTriangle_TC6() {

    }

    @Test
    void checkTriangle_TC7() {
        createTriangleAndAssertValue(2, 2, 3, "isosceles triangle");
    }

    @Test
    void checkTriangle_TC8() {

    }

    @Test
    void checkTriangle_TC9() {
        createTriangleAndAssertValue(2, 3, 1, "not triangle");
    }

    @Test
    void checkTriangle_TC10() {
        createTriangleAndAssertValue(3, 2, 2, "isosceles triangle");

    }

    @Test
    void checkTriangle_TC11() {
        createTriangleAndAssertValue(3, 4, 5, "scalene triangle");
    }
}
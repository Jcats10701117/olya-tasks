package by.bntu.fitr.povt.jcats.javatasks.task4.tests;

import by.bntu.fitr.povt.jcats.javatasks.task4.logic.MatrixCalculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class
MatrixCalculatorTest {

    @Test
    public void canSwapCols() {
        double[][] array = {
                {0, 1},
                {0, 1}
        };

        double[][] expected = {
                {1, 0},
                {1, 0}
        };

        MatrixCalculator.swapCols(array, 0, 1);

        assertArrayEquals(expected, array);
    }

    @Test
    public void canGetColAbsSum() {
        double[][] array = {
                {1, 2},
                {3, 4}
        };

        double expected = 4;
        double actual = MatrixCalculator.getColAbsSum(array, 0);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void canSortMatrix() {
        double[][] array = {
                { 1, 2 },
                { 1, 2 }
        };

        double[][] expected = {
                { 2, 1 },
                { 2, 1 }
        };

        MatrixCalculator.sortMatrix(array);

        assertArrayEquals(expected, array);
    }
}
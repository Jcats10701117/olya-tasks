package by.bntu.fitr.povt.jcats.javatasks.task4.logic;

public class MatrixCalculator {
    public static void swapCols(double[][] array, int first, int second) {
        double temp;
        double firstValue;
        double secondValue;
        for (double[] line: array) {
            temp = line[first];
            line[first] = line[second];
            line[second] = temp;
        }
    }

    public static double getColAbsSum(double[][] array, int colIndex) {
        double sum = 0;
        for (double[] line: array) {
            sum += line[colIndex];
        }
        return sum;
    }

    public static void sortMatrix(double[][] array) {
        boolean action = false;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (i < array.length - 1 && getColAbsSum(array, i) < getColAbsSum(array, i + 1)) {
                    swapCols(array, i, i + 1);
                    action = true;
                }
            }
            if (!action) {
                return;
            }
            else {
                action = false;
            }
        }
    }
}

import java.util.Random;

class MatrixOperations {

    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(20) - 10;
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    public static double[][] inverse2x2(int[][] matrix) {
        int determinant = determinant2x2(matrix);
        if (determinant == 0) return null;

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;

        return inverse;
    }

    public static double[][] inverse3x3(int[][] matrix) {
        int determinant = determinant3x3(matrix);
        if (determinant == 0) return null;

        double[][] cofactorMatrix = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[][] minor = new int[2][2];
                for (int m = 0, x = 0; m < 3; m++) {
                    if (m == i) continue;
                    for (int n = 0, y = 0; n < 3; n++) {
                        if (n == j) continue;
                        minor[x][y++] = matrix[m][n];
                    }
                    x++;
                }
                cofactorMatrix[i][j] = Math.pow(-1, i + j) * determinant2x2(minor);
            }
        }

        double[][] adjugate = transposeMatrix(cofactorMatrix);
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adjugate[i][j] / determinant;
            }
        }
        return inverse;
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%8.2f", value);
            }
            System.out.println();
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%8d", value);
            }
            System.out.println();
        }
    }
}

public class MatrixManipulation{

    public static void main(String[] args) {
        int[][] matrixA = MatrixOperations.generateMatrix(3, 3);
        int[][] matrixB = MatrixOperations.generateMatrix(3, 3);

        System.out.println("Matrix A:");
        MatrixOperations.displayMatrix(matrixA);

        System.out.println("Matrix B:");
        MatrixOperations.displayMatrix(matrixB);

        System.out.println("Addition of A and B:");
        MatrixOperations.displayMatrix(MatrixOperations.addMatrices(matrixA, matrixB));

        System.out.println("Subtraction of A and B:");
        MatrixOperations.displayMatrix(MatrixOperations.subtractMatrices(matrixA, matrixB));

        System.out.println("Multiplication of A and B:");
        MatrixOperations.displayMatrix(MatrixOperations.multiplyMatrices(matrixA, matrixB));

        System.out.println("Transpose of A:");
        MatrixOperations.displayMatrix(MatrixOperations.transposeMatrix(matrixA));

        System.out.println("Determinant of A:");
        System.out.println(MatrixOperations.determinant3x3(matrixA));

        System.out.println("Inverse of A:");
        double[][] inverseA = MatrixOperations.inverse3x3(matrixA);
        if (inverseA != null) {
            MatrixOperations.displayMatrix(inverseA);
        } else {
            System.out.println("Matrix A is not invertible.");
        }
    }
}

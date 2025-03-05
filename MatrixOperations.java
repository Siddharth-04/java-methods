import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        
        int[][] matrix1 = generateMatrix(rows, cols);
        int[][] matrix2 = generateMatrix(rows, cols);
        
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);
        
        System.out.println("Addition of Matrices:");
        displayMatrix(addMatrices(matrix1, matrix2));
        
        System.out.println("Subtraction of Matrices:");
        displayMatrix(subtractMatrices(matrix1, matrix2));
        
        if (rows == cols) {
            System.out.println("Transpose of Matrix 1:");
            displayMatrix(transposeMatrix(matrix1));
            
            if (rows == 2) {
                System.out.println("Determinant of 2x2 Matrix 1: " + determinant2x2(matrix1));
                System.out.println("Inverse of 2x2 Matrix 1:");
                displayMatrix(inverse2x2(matrix1));
            } else if (rows == 3) {
                System.out.println("Determinant of 3x3 Matrix 1: " + determinant3x3(matrix1));
                System.out.println("Inverse of 3x3 Matrix 1:");
                displayMatrix(inverse3x3(matrix1));
            }
        }
    }

    public static int[][] generateMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // Random values between 0-9
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        int[][] result = new int[mat1.length][mat1[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] mat1, int[][] mat2) {
        int[][] result = new int[mat1.length][mat1[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
               matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
               matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) return null;
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) det;
        inverse[0][1] = -matrix[0][1] / (double) det;
        inverse[1][0] = -matrix[1][0] / (double) det;
        inverse[1][1] = matrix[0][0] / (double) det;
        return inverse;
    }

    public static double[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) return null;
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int sign = (i + j) % 2 == 0 ? 1 : -1;
                inverse[j][i] = sign * determinant2x2(getMinor(matrix, i, j)) / (double) det;
            }
        }
        return inverse;
    }

    public static int[][] getMinor(int[][] matrix, int row, int col) {
        int[][] minor = new int[2][2];
        int r = 0, c;
        for (int i = 0; i < 3; i++) {
            if (i == row) continue;
            c = 0;
            for (int j = 0; j < 3; j++) {
                if (j == col) continue;
                minor[r][c++] = matrix[i][j];
            }
            r++;
        }
        return minor;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] matrix) {
        if (matrix == null) {
            System.out.println("Matrix is singular, no inverse exists.");
            return;
        }
        for (double[] row : matrix) {
            for (double num : row) {
                System.out.print(Math.round(num * 100.0) / 100.0 + "\t");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

class MatrixOperations {
    public void multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int rows1, int cols1, int cols2) {
        int[][] product = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        displayMatrix(product);
    }

    public void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for the first matrix: ");
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();
        int[][] firstMatrix = new int[rows1][cols1];

        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                firstMatrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number of columns for the second matrix: ");
        int cols2 = sc.nextInt();
        int[][] secondMatrix = new int[cols1][cols2];

        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < cols1; i++) {
            for (int j = 0; j < cols2; j++) {
                secondMatrix[i][j] = sc.nextInt();
            }
        }

        MatrixOperations mo = new MatrixOperations();
        System.out.println("Product of the matrices:");
        mo.multiplyMatrices(firstMatrix, secondMatrix, rows1, cols1, cols2);

        sc.close();
    }
}

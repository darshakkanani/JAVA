
import java.util.*;

public class multiplyTwoMatrix {

    public static int[][] input(Scanner sc, int a, int b) {
        int arr[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    } 

    public static void display(int[][] m) {
        int a = m.length;
        int b = m[0].length;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] multiply(int[][] m1, int[][] m2) {
        int a1 = m1.length;
        int b1 = m1[0].length;

        int a2 = m2.length;
        int b2 = m2[0].length;

        int result[][] = new int[a1][b1];

        for (int i = 0; i < a1; i++) {
            for (int j = 0; j < b2; j++) {
                for (int k = 0; k < b1; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of i(1st Matrix): ");
        int a1 = sc.nextInt();
        System.out.println("Enter the value of j(1st Matrix): ");
        int b1 = sc.nextInt();

        System.out.println("Enter the value of i(2nd Matrix): ");
        int a2 = sc.nextInt();
        System.out.println("Enter the value of j(2nd Matrix): ");
        int b2 = sc.nextInt();

        if (a1 != b2) {
            System.out.println("Matrix multiplication is not possible");
        } else {
            System.out.println("Enter elements of matrix 1: ");
            int[][] m1 = input(sc, a1, b1);

            System.out.println("Enter elements of matrix 2: ");
            int[][] m2 = input(sc, a2, b2);

            int[][] result = multiply(m1, m2);

            System.out.println("Result: ");
            display(result);
        }
    }
}

import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array: ");
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Elements of the array: ");
            for(int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid integers.");
        } finally {
            sc.close(); // close the scanner
        }
    }
}

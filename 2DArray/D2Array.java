import java.util.Scanner;

public class D2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of i: ");
        int n = sc.nextInt();
        System.out.print("Enter the size of j: ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];
        System.out.print("Enter the elements of array: ");

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
         System.out.print("Your array: ");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

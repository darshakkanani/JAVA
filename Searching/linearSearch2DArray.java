import java.util.Scanner;

public class linearSearch2DArray {

    public static void scan(int arr[][],int n,int m)
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void linear2D(int arr[][],int n,int m,int key)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(arr[i][j] == key)
                {
                    System.out.print("Yout number found index at: "+i +" "+j);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of i: ");
        int n = sc.nextInt();
        System.out.print("Enter the size of j: ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];
        System.out.print("Enter the elements of array: ");
        scan(arr,n,m);

        System.out.print("Enter the key: ");
        int key = sc.nextInt();

        linear2D(arr,n,m,key);

    }
}

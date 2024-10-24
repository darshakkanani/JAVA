import java.util.Scanner;

public class linearSearch {

    public static int linerSearch(int arr[],int size,int key)
    {
        for(int i = 0; i < size; i++)
        {
            if(arr[i] == key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void scan(int arr[],int size)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        scan(arr,n);
        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        

       
       int ans = linerSearch(arr,n,key);
       System.out.print("Key found at index no. : "+ ans );

    }
}

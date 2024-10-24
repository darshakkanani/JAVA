import java.util.*;

public class bubbleSort {

    public static void bubbleSort(int arr[],int size)
    {
        int i , j, min_idx;
        for(i = 0; i < size - 1; i++)
        {
            min_idx = i;
            for(j = i+1; j < size; j++)
            {
                if(arr[min_idx] > arr[j])
                {
                    int temp = arr[min_idx];
                    arr[min_idx] = arr[j]; 
                    arr[j] = temp;
                }
            }
        }
    }
    public static void scan(int arr[],int size)
    {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    public static void print(int arr[],int size)
    {
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }  

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[1000];
        System.out.print("Enter the array: ");
        scan(arr,size);

        bubbleSort(arr, size);
        System.out.println("--------------After sorting---------------");
        print(arr,size);

    }
    
}

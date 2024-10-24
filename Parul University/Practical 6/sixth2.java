
import java.util.*;

class sixth2 
{
    public static int fib(int n) 
    {
        if (n <= 1) 
        {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int N = sc.nextInt();

        for (int i = 1; i < N+1; i++) 
        {
            System.out.print(fib(i) + " ");
        }
    }
}

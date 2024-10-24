import java.util.*;

class Fibonacci
{
    public void nonRecFib(int n) {
        int temp = 0;
        int a = 1;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 1; i <= n - 2; i++) {
            temp = a + b;
            System.out.print(temp + " ");
            a = b;
            b = temp;
        }
    }

    public int recFib(int n) 
    {
        if (n <= 1) 
        {
            return n;
        }
        return recFib(n - 1) + recFib(n - 2);
    }
}


public class recNonrecFeb {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        Fibonacci fb = new Fibonacci();

        System.out.print("Non recursion: ");
        fb.nonRecFib(n);
        System.out.println();
        int ans = fb.recFib(n);
        System.out.print("Recursion: "+ans);
        System.out.println(); 

        sc.close();
    }
    
}

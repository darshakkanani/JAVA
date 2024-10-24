import java.util.*;

public class fibRec {
    
    public static int Fibonacci(int a)
    {
        if(a <= 2)
        {
            return 1;
        }
        return (Fibonacci(a-1)+Fibonacci(a-2));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.err.print("Fibonacci: ");
        
        for(int i = 1; i <= a; i++)
        {
            System.out.print(Fibonacci(i)+" ");
        }
        System.err.println("\n");
    }
}

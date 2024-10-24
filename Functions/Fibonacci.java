import java.util.Scanner;

public class Fibonacci {

    public static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        for(int i=1;i<=n-2;i++)
        {
            int temp = a + b;;
            System.out.print(temp+" ");
            a = b;
            b = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        fibonacci(n);
    }
}

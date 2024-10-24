
import java.util.*;

class Fibonacci {

    static void fib(int n) {
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
}

class classFib {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int N = sc.nextInt();

        Fibonacci.fib(N);
    }
}

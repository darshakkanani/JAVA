import java.util.Scanner;

public class factorial {

    public static int factorial(int n) {
        int mult = 1;
        if(n < 1)
        {
            System.out.println("Invalid number");
            return 0;
        }
        for(int i = 1; i <= n; i++)
        {
            mult = mult * i;
        }
        System.out.print("Factorial is ");
        return mult;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int ans = factorial(n);
        System.out.println(ans);

    }
}

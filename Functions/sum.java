import java.util.Scanner;

public class sum {

    public static int sum(int a, int b) {
        System.out.print("Answer is ");
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int ans = sum(a, b);
        System.out.println(ans);
    }
}

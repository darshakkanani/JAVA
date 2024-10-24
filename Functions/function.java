import java.util.Scanner;

public class function {
    public static void print(int a)
    {
        System.out.println("Number is "+a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        print(n);
    }
}

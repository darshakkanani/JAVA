import java.util.Scanner;

public class avgOf3 {

    public static int avg(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        System.out.print("avrage is ");
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number");
        int a = sc.nextInt();
        System.out.print("Enter the second number");
        int b = sc.nextInt();
        System.out.print("Enter the third number");
        int c = sc.nextInt();

        int avg = avg(a, b, c);
        System.out.print(avg);
    }
}

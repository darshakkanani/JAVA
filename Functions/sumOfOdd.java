import java.util.Scanner;

public class sumOfOdd {

    public static int sumOfOdd(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            if(i%2==1)
            {
                sum = sum + i;
            }
        }
        System.out.print("Sum is ");
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int ans = sumOfOdd(num);
        System.out.println(ans);
    }
}

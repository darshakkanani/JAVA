import java.util.Scanner;

public class power {

    public static int power(int b,int p)
    {
        int k = 1;
        for(int i=1;i<=p;i++)
        {
            k = b * k;
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a base: ");
        int b = sc.nextInt();
        System.out.print("Enter a power: ");
        int p = sc.nextInt();

        System.out.print("Answer is ");
        System.out.print(power(b,p));
    }
}

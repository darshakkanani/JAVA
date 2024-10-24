import java.util.Scanner;

class AandB
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of B: ");
        int b = sc.nextInt();

        if(a>b)
        {
            System.out.print("A is greater than B");
        }
        else if(a<b)
        {
            System.out.print("B id graeter than A");
        }
        else
        {
            System.out.print("A and B both are equal");
        }
    }
}
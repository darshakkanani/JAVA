import java.util.Scanner;

class pattern4
{
    public  static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        int i = a;
        while (i >= 1)
        {
            int j = 1;
            while (j <= i)
            {
                System.out.print("* ");
                j++;
            }
            System.out.println(" ");
            i--;
        }
    }
}
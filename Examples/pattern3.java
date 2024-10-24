import java.util.Scanner;

class pattern3
{
    public  static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        int i = 1;
        while (i <= a)
        {
            int j = 1;
            while (j <= i)
            {
                System.out.print("* ");
                j++;
            }
            System.out.println(" ");
            i++;
        }
    }
}
import java.util.Scanner;

class ifElse
{
    public  static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the your age: ");
        int a = sc.nextInt();

        if(a > 18)
        {
            System.out.print("Adult");
        }
        else
        {
            System.out.print("Not adult");
        }
    }
}
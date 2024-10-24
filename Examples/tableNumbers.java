import java.util.Scanner;

class tableNumbers{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
//        System.out.println("How much: ");
//        int b = sc.nextInt();
        for(int i = 0; i <= 10; i++)
        {
            System.out.println(a*i);
        }
    }
}
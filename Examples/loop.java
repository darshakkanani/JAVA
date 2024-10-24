import java.util.Scanner;

class loop{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int j = sc.nextInt();
        for(int i = 0; i < j; i = i + 1)
        {
            System.out.println("Hello World");
        }
    }
}
import java.util.Scanner;

class numberLoop{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int j = sc.nextInt();
        for(int i = 1; i <= j; i = i + 1)
        {
            System.out.println(i);
        }
    }
}
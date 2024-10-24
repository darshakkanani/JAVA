import java.util.Scanner;

class sumOfN{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int j = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= j)
        {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
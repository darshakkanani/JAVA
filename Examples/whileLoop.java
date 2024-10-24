import java.util.Scanner;

class whileLoop{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int j = sc.nextInt();
        int i = 1;
        while(i <= j)
        {
            System.out.println(i);
            i++;
        }
    }
}
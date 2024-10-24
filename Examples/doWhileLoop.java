import java.util.Scanner;

class doWhileLoop{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int j = sc.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while (i <= j);
    }
}
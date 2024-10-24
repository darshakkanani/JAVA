import java.util.*;
class input{
    public  static  void  main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int a = sc.nextInt();
        System.out.print("Enter the second value: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.print("Sum is: ");
        System.out.print(sum);
    }
}
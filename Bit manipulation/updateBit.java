import java.util.*;

public class updateBit {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number 0 or 1: ");
        int a = sc.nextInt();

        int n = 5;
        int pos = 1;
        int setBit = 1 << pos;

        if(a == 1)
        {
            int or = n | setBit;
            System.out.println("Number: "+or);
        }
        else if(a == 0)
        {
            int not = ~setBit;
            int and = not & n;
            System.out.println("Number: "+and);
        }
        else
        {
            System.out.println("Invalid input");
        }

    }
}

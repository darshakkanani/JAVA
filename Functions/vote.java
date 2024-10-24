import java.util.*;

public class vote {

    public static void vote(int a)
    {
        if(a > 18)
        {
            System.out.println("You can vote");
        }
        else
        {
            System.out.println("You cannot vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the your age: ");
        int age = sc.nextInt();

        vote(age);

    }
}

// 5. Write a Java program that prints all real solutions to the quadratic equation ax2+bx+c = 0. Read in a, b, c and use the quadratic
//  formula. If the discriminate b2-4ac is negative, display a message stating that there are no real solutions? 

import java.util.*;

public class fifth 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value od a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value od b: ");
        int b = sc.nextInt();
        System.out.print("Enter the value od c: ");
        int c = sc.nextInt();

        double d = ((b*b)-(4*a*c));
        
        if(d < 0)
        {
            System.out.println("No real root");
        }
        else
        {
            double x = ((-b) + Math.sqrt(d))/2*a;
            double y = ((-b) - Math.sqrt(d))/2*a;
            
            System.out.println("First root: "+x +"\nSecond root: "+y);
        }
    }
    
}

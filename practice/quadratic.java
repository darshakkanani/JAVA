import java.util.*;

// Aim:-Write a Java program that prints all real solutions to the quadratic
// equation ax2 + bx+c = 0. Read in a, b, c and use the quadratic formula. If
// the discriminate b2-4ac is negative, display a message stating that
// there are no real solutions?

public class quadratic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of A: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of B: ");
        int b = sc.nextInt();
        System.out.println("Enter the value of C: ");
        int c = sc.nextInt();

        int d = (b*b)-(4*a*c);

        if(d < 0){
            System.out.println("No real solutions.");
        }
        else if (d == 0) {
            double f = (-b/(2*a));
            System.out.println("Solution: " + f);
        }
        else{
            double f1 = ((-b) + (Math.sqrt(d)))/(2*a);
            double f2 = ((-b) - (Math.sqrt(d)))/(2*a);

            System.out.println("Solution 1: " + f1);
            System.out.println("Solution 2: " + f2);
        }
        
    }
    
}

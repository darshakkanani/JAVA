
import java.util.Scanner;

// 4. Write a java program to display the employee details using Scanner class. 

public class fourth 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the name: ");
        String s = sc.nextLine();
        

        System.out.print("Enter the ID: ");
        int i = sc.nextInt();
        

        System.out.print("Enter the salary: ");
        float sr = sc.nextFloat();

        System.out.println("Name: "+s);
        System.out.println("ID: "+i);
        System.out.println("Salary: "+sr);
        
    }
}

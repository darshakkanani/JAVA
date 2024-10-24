import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = "Darshak";
        String name2 = "Kanani";

        if(name1.compareTo(name2)==0)
        {
            System.out.print("name1 and name2 are equal");
        }
        else if(name1.compareTo(name2) > 0)
        {
            System.out.print("name2 is bigger");
        }
        else
        {
            System.out.println("name1 is bigger");
        }
    }
    
}

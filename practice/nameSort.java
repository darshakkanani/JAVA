import java.util.Arrays;
import java.util.Scanner;

public class nameSort {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int numNames = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[numNames];

        System.out.println("Enter the names:");
        for (int i = 0; i < numNames; i++) {
            names[i] = scanner.nextLine();
        }

        Arrays.sort(names);

        System.out.println("Sorted names in ascending order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
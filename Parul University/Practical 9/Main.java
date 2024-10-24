
import java.util.Arrays;
import java.util.Scanner;
// Main class that contains the program's entry point.

public class Main {

    public static void main(String[] args) {
// Print a message to the console.
        System.out.println("Prince_Chhodavadiya");
// Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);
// Prompt the user to enter the number of names.
        System.out.print("Enter the number of names: ");
        int numNames = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
// Create an array to store the names based on the user's input.
        String[] names = new String[numNames];
// Prompt the user to enter the names one by one.
        System.out.println("Enter the names:");
        for (int i = 0; i < numNames; i++) {
            names[i] = scanner.nextLine();
        }
// Sort the names in ascending order using the Arrays.sort method.
        Arrays.sort(names);
// Display the sorted names in ascending order.
        System.out.println("Sorted names in ascending order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

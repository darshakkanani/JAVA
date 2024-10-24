import java.util.Arrays;
import java.util.Scanner;

public class method2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list of names (separated by commas):");

        String[] names = scanner.nextLine().split(",");
        String[] sortedNames = new String[names.length];

        System.arraycopy(names, 0, sortedNames, 0, names.length);

        Arrays.sort(sortedNames);

        System.out.println("Sorted list of names in ascending order:");
        for (String name : sortedNames) {
            System.out.println(name);
        }
    }
}
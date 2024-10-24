import java.util.ArrayList;
import java.util.Scanner;

public class operationOnArrayList {
    public static void main(String[] args) {
        System.out.println("Prince_Chhodavadiya");
        ArrayList<String> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Options:");
            System.out.println("1. Add item");
            System.out.println("2. Search item");
            System.out.println("3. Remove item");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter item to add: ");
                    String newItem = scanner.nextLine();
                    items.add(newItem);
                    System.out.println("Item added: " + newItem);
                    break;
                case 2:
                    System.out.print("Enter item to search: ");
                    String searchItem = scanner.nextLine();
                    if (items.contains(searchItem)) {
                        System.out.println(searchItem + " found in the list.");
                    } else {
                        System.out.println(searchItem + " not found in the list.");
                    }
                    break;
                case 3:
                    System.out.print("Enter item to remove: ");
                    String removeItem = scanner.nextLine();
                    if (items.contains(removeItem)) {
                        items.remove(removeItem);
                        System.out.println(removeItem + " removed from the list.");
                    } else {
                        System.out.println(removeItem + " not found in the list.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}

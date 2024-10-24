import java.util.InputMismatchException;
import java.util.Scanner;

public class singleTryBlock {
    public static void main(String[] args) {
        System.out.println("Prince_Chhodavadiya");
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int result = 10 / number;
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            System.out.println("Execution completed.");
            scanner.close();
        }
    }
}


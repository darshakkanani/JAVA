import java.util.Scanner;
import java.util.StringTokenizer;

public class sumOfIntegers {
    public static void main(String[] args) {
        System.out.println("Prince_Chhodavadiya");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of integers separated by spaces: ");
        String inputLine = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(inputLine);
        int sum = 0;

        System.out.println("Integers and their sum:");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            int number = Integer.parseInt(token);
            System.out.println(number);
            sum += number;
        }

        System.out.println("Sum of all integers: " + sum);
    }
}


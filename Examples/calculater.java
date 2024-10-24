import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter the Second number: ");
        float b = sc.nextFloat();
        System.out.print("Enter the operator: ");
        String operator = sc.next();

        switch (operator) {
            case "+":
                System.out.print("Sum: ");
                System.out.print(a + b);
                break;
            case "-":
                System.out.print("Difference: ");
                System.out.print(a - b);
                break;
            case "*":
                System.out.print("Product: ");
                System.out.print(a * b);
                break;
            case "/":
                if (b != 0) {
                    System.out.print("Division: ");
                    System.out.print(a / b);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
            case "%":
                System.out.print("Remainder: ");
                System.out.print(a % b);
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}

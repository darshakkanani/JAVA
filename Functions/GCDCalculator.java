public class GCDCalculator {

    public static int calculateGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        int number1 = 24;
        int number2 = 36;

        System.out.println("GCD of " + number1 + " and " + number2 + " is: " + calculateGCD(number1, number2));
    }
}

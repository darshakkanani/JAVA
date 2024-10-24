class ArithmeticOperations {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double divide(int a, int b) {
        return (double) a / b;
    }
    public int modulus(int a, int b) {
        return a % b;
    }
}
    class BitwiseOperations {
    public int bitwiseAnd(int x, int y) {
        return x & y;
    }
    public int bitwiseOr(int x, int y){
        return x | y;
    }
    public int bitwiseXor(int x, int y) {
        return x ^ y;
    }
    public int bitwiseLeftShift(int x, int n) {
        return x << n;
    }
    public int bitwiseRightShift(int x, int n) {
        return x >> n;
    }    
}

public class Arithmetic_Bitwise {
    public static void main(String[] args){

        System.out.println("Prince_Chhodavadiya");
   
        int a = 10;
        int b = 5;

        ArithmeticOperations arithmetic = new ArithmeticOperations();
        BitwiseOperations bitwise = new BitwiseOperations();

        int addition = arithmetic.add(a, b);
        int subtraction = arithmetic.subtract(a, b);
        int multiplication = arithmetic.multiply(a, b);
        double division = arithmetic.divide(a, b);
        int modulus = arithmetic.modulus(a, b);

        int x = 12;
        int y = 6;

        int bitwiseAnd = bitwise.bitwiseAnd(x, y);
        int bitwiseOr = bitwise.bitwiseOr(x, y);
        int bitwiseXor = bitwise.bitwiseXor(x, y);
        int bitwiseLeftShift = bitwise.bitwiseLeftShift(x, 2);
        int bitwiseRightShift = bitwise.bitwiseRightShift(x, 2);

        System.out.println("Arithmetic Operations:");
        System.out.println(a + " + " + b + " = " + addition);
        System.out.println(a + " - " + b + " = " + subtraction);
        System.out.println(a + " * " + b + " = " + multiplication);
        System.out.println(a + " / " + b + " = " + division);
        System.out.println(a + " % " + b + " = " + modulus);

        System.out.println("\nBitwise Operations:");
        System.out.println(x + " & " + y + " = " + bitwiseAnd);
        System.out.println(x + " | " + y + " = " + bitwiseOr);
        System.out.println(x + " ^ " + y + " = " + bitwiseXor);
        System.out.println(x + " << 2 = " + bitwiseLeftShift);
        System.out.println(x + " >> 2 = " + bitwiseRightShift);
    }
}
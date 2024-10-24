public class arith_bitwise{
    public static void main(String[] args){

        int a = 20;
        int b = 10;

        int A = a + b;
        System.out.println("Addition: " + A);
        int S = a - b;
        System.out.println("Subtraction: " + S);
        int M = a * b;
        System.out.println("Multiplication: " + M);
        int D = a / b;
        System.out.println("Division: " + D);
        int R = a % b;
        System.out.println("Remainder:" + R);

        int x = 12; 
        int y = 6; 
        
        int Or = x | y;
        System.out.println("Bitwise OR: " + Or);
        int And = x & y;
        System.out.println("Bitwise AND:" + And);
        int NotX = ~x;
        System.out.println("Bitwise NOT of x: " + NotX);
        int NotY = ~y;
        System.out.println("Bitwise NOT of y: " + NotY);
        int Xor = x ^ y;
        System.out.println("Bitwise XOR:" + Xor);
        int rightShift = x >> 2;
        System.out.println("Bitwise Right Shift:" + rightShift);
        int leftShift = x << 2;
        System.out.println("Bitwise Left Shift:" + leftShift);

    }
}
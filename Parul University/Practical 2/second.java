// 2. Write a program to perform arithmetic and bitwise operations in a single source program without object creation. 

public class second 
{
    public static void main(String[] args) 
    {

         // Arithmetic operations
         int a = 140;
         int b = 895;
 
         int s = a + b;
         int d = a - b;
         int p = a * b;
         int q = a / b;
         int r = a % b;
 
         System.out.println("Sum: " + s);
         System.out.println("Difference: " + d);
         System.out.println("Product: " + p);
         System.out.println("Quotient: " + q);
         System.out.println("Remainder: " + r);
 
         // Bitwise operations
         int x = 140; // 101 
         int y = 895; // 011 
 
         int And = x & y;
         int Or = x | y;
         int Xor = x ^ y;
         int Complement = ~x;
         int leftShift = x << 1;
         int rightShift = x >> 1;
 
         System.out.println("\nBitwise Operations:");
         System.out.println("Bitwise AND: " + And);
         System.out.println("Bitwise OR: " + Or);
         System.out.println("Bitwise XOR: " + Xor);
         System.out.println("Bitwise Complement: " + Complement);
         System.out.println("Left Shift: " + leftShift);
         System.out.println("Right Shift: " + rightShift);
    }
    
}

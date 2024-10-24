public class third {

    public static class Arithmetic {

        public int sum(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public int divide(int a, int b) {
            return a / b;
        }

        public int modulus(int a, int b) {
            return a % b;
        }
    }

    public static class Bitwise {

        public int And(int a, int b) 
        {
            return a & b;
        }

        public int Or(int a, int b) {
            return a | b;
        }

        public int Xor(int a, int b) {
            return a ^ b;
        }

        public int Complement(int a) {
            return ~a;
        }

        public int leftShift(int a, int numBits) {
            return a << numBits;
        }

        public int rightShift(int a, int numBits) {
            return a >> numBits;
        }
    }

    public static void main(String[] args) {
        Arithmetic a = new Arithmetic();
        Bitwise b = new Bitwise();

        int o1 = 2;
        int o2 = 87;

        int s = a.sum(o1, o2);
        int d = a.subtract(o1, o2);
        int p = a.multiply(o1, o2);
        int q = a.divide(o1, o2);
        int r = a.modulus(o1, o2);

        System.out.println("Arithmetic Operations:");
        System.out.println("Sum: " + s);
        System.out.println("Difference: " + d);
        System.out.println("Product: " + p);
        System.out.println("Quotient: " + q);
        System.out.println("Remainder: " + r);

        int x = 5;
        int y = 3;

        int And = b.And(x, y);
        int Or = b.Or(x, y);
        int Xor = b.Xor(x, y);
        int Complement = b.Complement(x);
        int leftShift = b.leftShift(x,1);
        int rightShift = b.rightShift(x, 1);

        System.out.println("\nBitwise Operations:");
        System.out.println("Bitwise AND: " + And);
        System.out.println("Bitwise OR: " + Or);
        System.out.println("Bitwise XOR: " + Xor);
        System.out.println("Bitwise Complement: " + Complement);
        System.out.println("Left Shift: " + leftShift);
        System.out.println("Right Shift: " + rightShift);
    }
}

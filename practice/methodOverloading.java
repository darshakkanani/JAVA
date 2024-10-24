class Overloading {
    public Overloading() {
        System.out.println("Default constructor");
    }

    public Overloading(int x) {
        System.out.println("Parameterized constructor with int: " + x);
    }

    public Overloading(double y) {
        System.out.println("Parameterized constructor with double: " + y);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String s1, String s2) {
        return s1 + s2;
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        
        Overloading obj = new Overloading();
        Overloading objInt = new Overloading(10);
        Overloading objDouble = new Overloading(5.5);

        int result1 = obj.add(5, 3);
        double result2 = obj.add(2.5, 3.7);
        String result3 = obj.add("Hello, ", "world!");

        System.out.println("Result of int addition: " + result1);
        System.out.println("Result of double addition: " + result2);
        System.out.println("Result of string concatenation: " + result3);
    }
}

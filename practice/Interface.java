interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

class Rectangle implements Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Interface {
    public static void main(String[] args) {
        System.out.println("Prince_Chhodavadiya");
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}

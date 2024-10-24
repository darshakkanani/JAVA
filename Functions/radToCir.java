import java.util.Scanner;

public class radToCir {

    public static double cir(double a)
    {
        double ans = 2 * 3.14 * a;
        System.out.print("circumference of a circle is ");
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double ans = cir(radius);
        System.out.println(ans);
    }
}

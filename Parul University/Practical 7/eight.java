import java.util.*;

public class eight {
    
    public static boolean prime(int x) {
        if (x <= 1) {
            return false;
        }
        if (x == 2 || x == 3) {
            return true;
        }
        if (x % 2 == 0 || x % 3 == 0) {
            return false;
        }
        for (int i = 5; i <= Math.sqrt(x); i += 6) {
            if (x % i == 0 || x % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        
        System.out.print("Prime numbers up to " + x + ": ");
        for (int i = 2; i <= x; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
        sc.close();
    }
}

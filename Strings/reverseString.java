
public class reverseString {
    public static void main(String[] args) {
        
        StringBuilder sc = new StringBuilder("Hello");

        for(int i = 0; i < sc.length()/2;i++)
        {
            int front =  i;
            int back = sc.length()-i-1;

            char frontChar = sc.charAt(front);
            char backChar = sc.charAt(back);

            sc.setCharAt(front,backChar);
            sc.setCharAt(back,frontChar);
        }
        System.out.println(sc);
    }
}


public class stringBuilderEx {
    public static void main(String args[]){

        // Scanner sc = new Scanner(System.in);

        StringBuilder c = new StringBuilder("Hello");
        System.out.println(c);

        // char at index 0
        System.out.println(c.charAt(0));

        // set char at index 0

        c.setCharAt(0, 'C');
        System.out.println(c);

        // insert at index 0

        c.insert(0,'J');
        System.out.println(c);

        //delete at index 0

        System.out.println(c.delete(0, 1));

        // append

        System.out.println(c.append('k'));

        // length

        System.out.println(c.length());
    }
    
}

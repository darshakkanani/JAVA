public class stringBuffer {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" Hii");
        
        String s = sb.toString();
        System.out.println(s);

        sb.delete(1, 3);
        System.err.println(sb);
    }
    
}

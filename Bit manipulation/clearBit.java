class clearBit{
    public static void main(String args[])
    {
        int n = 5;
        int pos = 2;
        int bit = 1 << pos;
        int not = ~bit;
        System.out.println("Not: "+not);
 
        int and = not & n;
        System.out.println("And "+and);
    }
}
class setBit{
    public static void main(String args[])
    {
        int n = 5;
        int pos = 1;
        int bit = 1 << pos;

        int set = bit | n;
        System.out.println(set);
    }
}
class getBit {
    public static void main(String args[]) {
        int n = 5;
        int pos = 3;
        int bitMask = 1 << pos; 

        if((n & bitMask) != 0) {
            System.out.println("Your bit was 1");
        } else {
            System.out.println("Your bit was 0");
        }
    }
}

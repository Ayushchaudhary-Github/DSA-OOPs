class casting {
    public static void main(String[] args) {
        /*
         * Implicit casting
         * will perform the conversion automatically.
         * byte -> short -> int -> long
         */

        char ch = 'a';
        int a = ch;
        System.out.println(a);
        long b = 20;
        float c = 24.62f;
        double x = b * c;
        System.out.println(x);

        /*
         * Explicit casting
         * is used to convert one data type to another forcefully thats why after
         * changing the data
         * some data will lose.
         * byte <- short <- int <- long
         */

        int ab2 = 102;
        short ch2 = (short) ab2;
        System.out.println(ch2);
        double x2 = 328.288006786;
        long y2 = (long) x2 / 20;
        System.out.println(y2);

    }
}
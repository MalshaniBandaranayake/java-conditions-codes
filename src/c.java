public class c {
    void plus() {
        int a = 10;
        long b = 123456;
        long c = a + b;
        if (c < 1000000 | c == 123) { // or
            System.out.println(c+"calling if");
        } else {
            System.out.println(b);
        }
    }
}
    class D extends c {
        void minus() {
            double a = 123.876;
            double b = 524237.97356;
            double c = a - b;
            if (c > 500000 && c == 156787.9787) { // and
                System.out.println(c);
            } else if (c > 500000 && c < b) {
                System.out.println(c+ "calling else if");

            } else {
                System.out.println(b);
            }
        }

        public static void main(String[] args) {
            D d = new D();
            c c = new c();
            d.minus();
            c.plus();
        }
    }


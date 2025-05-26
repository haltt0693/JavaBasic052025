public class TestThuTu {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        int d, e, f;
        d = e= f = 999;


        System.out.println("a + b * c   = " + (a + b * c));
        System.out.println("(a + b) * c = " + ((a + b) * c));
        System.out.println("a / b - c   = " + (a / b - c));
        System.out.println("a / (b - c) = " + (a / (b - c)));
        System.out.println("a % b = " + a % b);
        System.out.println("a / b = " + a / b);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(b--);
        System.out.println(d);
    }
}

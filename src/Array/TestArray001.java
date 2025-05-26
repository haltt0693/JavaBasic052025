package Array;

public class TestArray001 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // khai báo và khởi tạo mảng
        int a[] = new int[5];
        a[0] = 10; // gán giá trị
        a[1] = 209;
        a[2] = 50;
        System.out.println("Length of array = " +a.length);

        System.out.println("----------------------------");
        System.out.println(a[1]);

        System.out.println("----------------------------");

        // in mảng ra màn hình
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }

        System.out.println("----------------------------");

        // in mảng ra màn hình
        for (int i = 2; i < 3; i++) {
            System.out.println(a[i] + " ");
        }

        System.out.println("----------------------------");


        for (int number : a){
            System.out.println(number);
        }
    }
}

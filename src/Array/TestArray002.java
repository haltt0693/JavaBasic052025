package Array;

public class TestArray002 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // gán mảng nặc danh cho mảng a
        int a[] = {33, 37, 41, 56, 12, 9, 07};
        System.out.println("Length of array: " + a.length);

        System.out.println("I----------------------------");
        // in mảng a ra màn hình
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }


        System.out.println("II----------------------------");
        System.out.println(a[3]);


        System.out.println("III----------------------------");
        for (int number : a) {
            System.out.println(number);
        }

        String dataCustomer[] = {"Hoa", "Hong", "Hue"};
        System.out.println(dataCustomer[0]); // Test lan 1
        System.out.println(dataCustomer[1]); // Test lan 2
        System.out.println(dataCustomer[2]); // Test lan 3
    }
}

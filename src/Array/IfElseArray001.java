package Array;

public class IfElseArray001 {
    public static void main(String[] args) {
        String dataCustomer[] = {"Hoa", "Hong", "Hue"};
        boolean check = true;
        for (int i = 0; i < dataCustomer.length; i++) {
            if (dataCustomer[i].equals("Hue")) {
//                System.out.println("Co ban Lan");
                check = true;
                break;
            } else {
//                System.out.println("Ko co ban Lan");
                check = false;
            }


        }
        if (check == true) {
            System.out.println("Co ban Hue");
        } else {
            System.out.println("Ko co ban Hue");
        }
    }
}
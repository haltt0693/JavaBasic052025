package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        //Khai báo kiểu du lieu
        //Luu duoc nhieu gia tri trung lap
        List<String> menu = new ArrayList<>();


        //Them du lieu
        menu.add("Hambergero");
        menu.add("Break");
        menu.add("yoghout1");
        menu.add("yoghout2");
        menu.add("popo");
        System.out.println(menu);
        System.out.println("I-----------------------------------");


        //Xoa du lieu
        System.out.println("II-----------------------------------");
        menu.remove(2);
        System.out.println(menu);

        //Cap nhat du lieu
        System.out.println("II-----------------------------------");
        menu.add(3, "Update001");
        System.out.println(menu);


        System.out.println("III1-----------------------------------");
        //Kiem tra du lieu
        System.out.println(menu.contains("009"));

        System.out.println("III2-----------------------------------");
        //Get gia tri theo chi muc
        System.out.println(menu.get(3));

        System.out.println("III3-----------------------------------");
        //Duyet du lieu kieu arraylist
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i));
        }
        System.out.println("IIII-----------------------------------");
        int j = 0;
        for (String value : menu) {
            System.out.println(menu.get(j));
            j++;
        }


        // Them nguyen 1 bo data vao menu 2
        System.out.println("IIIII1-----------------------------------");

        List<String> menu2 = new ArrayList<>();
        menu2.addAll(menu);
        System.out.println(menu2);

        System.out.println("IIIII1-----------------------------------");
        for (int i = 0; i < menu2.size(); i++) {
            System.out.println(menu2.get(i));
        }

    }
}

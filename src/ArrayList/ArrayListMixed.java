package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListMixed {
    public static void main(String[] args) {
        //Khai báo kiểu du lieu
        //Luu duoc nhieu gia tri trung lap
        List<Object> menu = new ArrayList<>();


        //Them du lieu
        menu.add("Hambergero");
        menu.add("Break");
        menu.add("yoghout1");
        menu.add("yoghout2");
        menu.add(8989);
        menu.add("popo");


        System.out.println(menu);
    }
}

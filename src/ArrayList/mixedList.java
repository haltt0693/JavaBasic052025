package ArrayList;

import java.util.ArrayList;

public class mixedList {
    public static void main(String[] args) {
        ArrayList<Object> mixedList = new ArrayList<>();

        mixedList.add("Hello");
        mixedList.add(123);           // Integer
        mixedList.add(45.67);         // Double
        mixedList.add(true);          // Boolean
        mixedList.add(7896);

        for (Object item : mixedList) {
            System.out.println(item + " (type: " + item.getClass().getSimpleName() + ")");
        }
        System.out.println("-----------------------------");
        System.out.println(mixedList);
    }
}

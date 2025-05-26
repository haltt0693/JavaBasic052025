package Collection;

import java.util.HashMap;
import java.util.Map;

public class DemoMap002 {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("Windows", "XP");
        hashMap.put("Windows", "2000");
        hashMap.put("Language2", "Java");
        hashMap.put("Language1", ".Net");

        hashMap.remove("Language1");
        System.out.println("Các phần tử của Map");
        System.out.print("\t" + hashMap + "\n");
        System.out.println("I---------------------------------------");
        System.out.println(hashMap.containsKey("Windows"));
        System.out.println("II---------------------------------------");
        System.out.println(hashMap.containsValue(".Net"));
        System.out.println("III---------------------------------------");
        System.out.println("Các phần tử của Map");
        System.out.print("\t" + hashMap + "\n");

        //2 trường hợp mình dùng nhiều là đọc data Excel và JSON
        //Thiết lập config cho Driver trong Selenium
        System.out.println("IIII---------------------------------------");
        //Truy xuất giá trị theo từng key
        System.out.println(hashMap.get("Windows"));
        System.out.println("IIIII---------------------------------------");
        //Get hết giá trị của key và value
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

package ArrayList;

import java.util.Locale;

public class XuLyChuoi {
    public static void main(String[] args) {
        String s1 = "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form";
        String s2 = "    If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the    ";

        //Cat chuoi, chuoi bat dau tu 0, tinh khoang trang la 1 ki tu
        System.out.println("1-------------------------------");
        System.out.println(s1.substring(11));
        System.out.println("tu 11 den 23: " + s1.substring(11, 23));


        //Ghep chuoi
        System.out.println("2-------------------------------");
        System.out.println(s1 + "----" + s2);

        //Chuyen kieu in hoa thuong
        System.out.println("3-------------------------------");
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());


        //Xoa ki tu khoang trang 2 dau
        System.out.println("4-------------------------------");
        System.out.println(s2.trim());


        //Do dai chuoi
        System.out.println("5-------------------------------");
        System.out.println(s2.length());


        //Tim kiem bang index
        System.out.println("6.1-------------------------------");
        System.out.println(s2.charAt(8));

        //Tim kiem bang ki tu
        System.out.println("6.2-------------------------------");
        System.out.println(s2.indexOf("r"));


        //So sanh chuoi
        //So sanh bang

        System.out.println("7.1-------------------------------");
        String s3 = "test 001";
        System.out.println(s2.equals(s3));

        //So sanh chua
        System.out.println("7.2-------------------------------");
        String s4 = "passage of2";
        System.out.println(s2.contains(s4));
        System.out.println(s2.contains("Lorem Ipsum"));

        //So sanh bo qua hoa thuong
        System.out.println("7.3-------------------------------");
        String s5 = "Lorem Ipsum";
        System.out.println(s5.equalsIgnoreCase("lorem ipsum"));
        System.out.println(s5.compareToIgnoreCase("lorem ipsUM"));
    }
}

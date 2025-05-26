package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        Set<String> menu = new HashSet<String>();

        menu.add("Hambergero");
        menu.add("Break");
        menu.add("yoghout2");
        menu.add("yoghout1");

        System.out.println("Các phần tử của Set: ");
        System.out.print("\t" + menu + "\n");

        //Duyet gia trị trong set

        // Show set through Iterator
        System.out.println("\n--------------------------------");
        Iterator<String> itr = menu.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        // Show set through for-each
        System.out.println("\n--------------------------------");

        for (String obj : menu) {
            System.out.print(obj + ", ");
        }
    }
}

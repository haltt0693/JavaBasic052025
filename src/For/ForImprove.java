package For;

public class ForImprove {
    public static void main(String[] args) {
        String arr01[] = {"A", "B", "K", "P", "D"};
        for (String i : arr01){
            System.out.println(i);
        }

        int arr02[] = { 12, 23, 44, 56, 78 };
        for (int number : arr02) {
            System.out.println(number);
        }

        for (int number =0; number < 5; number++){
            System.out.println(arr02[number]);
        }
    }
}

public class PhuongThuc {
    public double sum;
    public double result;


    //Ko tra ve ket qua
    public void cong2so(){
        int a = 5;
        int b = 10;
        sum = a + b;
//        System.out.println(sum);

    }

    //Ham co tham so
    public void cong2so(int number1, int number2){
        System.out.println(number1 + number2);

    }

    public double nhan2so(int number1, int number2){
        return number1 * number2;
    }

    public double cong3so(int number1, int number2, int number3){
        return number1 + number2 +number3;
    }

    //co tra ve ket qua
    public double nhan2so(){
        int a = 5;
        int b = 10;
        result = a*b;
        return result;
    }

    public static void main(String[] args) {
        PhuongThuc phuongThuc = new PhuongThuc();
        phuongThuc.cong2so();
//        System.out.println(phuongThuc.cong2so() + 5);
        phuongThuc.nhan2so();
        System.out.println(phuongThuc.nhan2so() + 10);
        phuongThuc.cong2so(5,9);
        System.out.println(phuongThuc.nhan2so(6, 7));
        System.out.println(phuongThuc.nhan2so(8,9)* phuongThuc.cong3so(1,2,3));

    }
}

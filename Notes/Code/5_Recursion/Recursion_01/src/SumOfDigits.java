public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(DigitSum(12345));
    }

    static int DigitSum(int n){
        int rem = n % 10;
        if (rem == 0){
            return 0;
        }
        return DigitSum(n/10) + rem;
    }
}

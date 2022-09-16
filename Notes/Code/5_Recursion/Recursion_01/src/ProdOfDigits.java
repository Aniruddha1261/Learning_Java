public class ProdOfDigits {
    public static void main(String[] args) {
        System.out.println(ProdSum(12345));
    }
    //Product of digits of a number
    static int ProdSum(int n){
        int rem = n % 10;
        if (rem == n){
            return n;
        }
        return ProdSum(n/10) * rem;
    }
}

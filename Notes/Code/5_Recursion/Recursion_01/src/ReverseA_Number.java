public class ReverseA_Number {

    // cheat method
    static int sum = 0;
    static void Rev2(int n){
        if (n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10  + rem;
        Rev2(n/10);
    }

    static int Rev3(int n){
        // sometimes you might need some additional variables in the argument in that case, make another function.
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits){
        if (n%10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)Math.pow(10, digits-1) + helper(n/10, digits-1);
    }

    static int Rev(int n){
        int rem = n % 10;
        if (rem == n){
            return n;
        }
        return rem + Rev(n/10);

    }

    // Find if the number is palindrome

    static boolean palin(int n){
//        if (n == Rev3(n)){
//            return true;
//        }
//        return false;
        return  n == Rev3(n);
    }

    public static void main(String[] args) {
        System.out.println(palin(12321));
    }
}

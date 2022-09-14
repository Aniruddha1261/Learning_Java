public class SquareRoot {
    // https://leetcode.com/problems/sqrtx/

    // Q: Given a non-negative integer x, compute and return the square root of x.
    //Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
    //Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        int start = 1;
        int end = x ;
        if (x < 2){
            return x;
        }
        while(start < end ){
            int mid = start + (end - start)/2;

            if (mid*mid == x){
                return mid;
            } else if (mid * mid > x) {
                end = mid - 1;
            } else {
                start = mid + 1;

            }
        }
        return start;
    }
}

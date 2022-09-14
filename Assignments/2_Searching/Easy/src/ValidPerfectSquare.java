public class ValidPerfectSquare {
    // https://leetcode.com/problems/valid-perfect-square/

    // Q: Given a positive integer num, write a function which returns True if num is a perfect square else False.
    //Follow up: Do not use any built-in library function such as sqrt.

    public static void main(String[] args) {
        int num = 2147483647;
        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {

        int s = 0;
        int e = (int)Math.sqrt(num) + 1;
        while(s <= e){
            int mid = s + (e - s)/2;
            if(mid*mid == num){
                return true;
            } else if (num < mid*mid) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return false;
    }
}

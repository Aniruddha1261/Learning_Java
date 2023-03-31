package Questions;
// Q7: https://leetcode.com/problems/happy-number/
public class Q07_HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        boolean ans = isHappy(n);
        System.out.println(ans);
    }


    // using fast and slow pointer method
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        return slow == 1;
    }


    private static int findSquare(int number){
        int ans = 0;
        while (number > 0){
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }
}


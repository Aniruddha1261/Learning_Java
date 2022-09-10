public class FindNumbersWithEvenNumberOfDigits {
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

    // Q: Given an array nums of integers, return how many of them contain an even number of digits.
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int digits = 0;

            while (num > 0) {
                num = num / 10;
                digits++;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}

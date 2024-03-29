import java.util.Arrays;

public class TwoSum {
    // https://leetcode.com/problems/two-sum/

    // Q: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //You can return the answer in any order.
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if( nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }

        return ans;
    }
}

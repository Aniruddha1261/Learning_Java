import com.sun.source.tree.WhileLoopTree;

import java.util.Arrays;

public class SortArrayByParity {
    // https://leetcode.com/problems/sort-array-by-parity/

    // Q: Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
    //Return any array that satisfies this condition.

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int k = 0;
        while (i < nums.length && j >= 0){
            if (nums[i] % 2 == 0){
                ans[k] = nums[i];
                k++;
            } else {
                ans[j] = nums[i];
                j--;
            }
            i++;
        }

        return ans;
    }
}

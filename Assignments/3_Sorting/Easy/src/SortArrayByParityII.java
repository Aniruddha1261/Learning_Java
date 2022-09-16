import java.util.Arrays;

public class SortArrayByParityII {
    // https://leetcode.com/problems/sort-array-by-parity-ii/

    // Q: Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
    //Sort the array so that whenever nums[i] is odd, (i) is odd, and whenever nums[i] is even, (i) is even.
    //Return any answer array that satisfies this condition.

    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        System.out.println(Arrays.toString(solve(nums)));
    }


    public static int[] solve(int[] nums){

        int i = 0;
        int k = 1;
        while(i < nums.length){
            if (nums[i] % 2 != 0){
                if (nums[k] % 2 == 0){
                    swap(nums, i, k);
                } else {
                    k += 2;
                }
            } else {
                i += 2;
            }
        }
        return nums;
    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        int j = 1;
        int k = 0;
        while (k < nums.length){
            if (nums[k] % 2 ==0){
                ans[i] = nums[k];
                i += 2;
            } else {
                ans[j] = nums[k];
                j += 2;
            }
            k++;
        }
        return ans;
    }
}

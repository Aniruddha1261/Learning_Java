import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumbers {
    // https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

    // Q: Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
    // That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
    //Return the answer in an array.
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
       // System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
        System.out.println(Arrays.toString(fun(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int k = 0;
            int count = 0;
            while(k < nums.length){
                if (nums[i] > nums[k]){
                    count++;
                }
                k++;
            }
            ans[i] = count;
        }
        return ans;
    }

    public static int[] fun(int[] nums){
        int[] ans = new int[nums.length];
        int i = 0;
        int j = 0;
        int k = 0;
        int count = 0;
        while(i < nums.length){
            if (nums[i] > nums[j]){
                count++;
                j++;
            } else {
                j++;
            }
            if (j >= nums.length){
                j = 0;
                i++;
                ans[k] = count;
                k++;
                count = 0;
            }
        }

        return ans;
    }

}

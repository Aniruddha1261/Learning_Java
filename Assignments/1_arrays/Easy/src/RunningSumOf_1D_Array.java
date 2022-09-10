import java.util.Arrays;

public class RunningSumOf_1D_Array {
    // https://leetcode.com/problems/running-sum-of-1d-array/

    // Q: Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
    //Return the running sum of nums.
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
        System.out.println(Arrays.toString(runningSum1(nums)));
    }

    public static int[] runningSum(int[] nums) {
        //int[] arr;
        // arr[i] = nums[i + j] + nums[1] + ... nums[i]

        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            // taking sum[i]
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                // sump[i] = arr[
                sum = sum + nums[j];
//                sum1[i] = sum;
            }
//            System.out.println(sum);
            arr[i] = sum;
        }
//        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static int[] runningSum1(int[] nums) {

        int[] sol_arr = new int[nums.length];

        sol_arr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sol_arr[i] = sol_arr[i-1] + nums[i];
        }
        return sol_arr;
    }

}

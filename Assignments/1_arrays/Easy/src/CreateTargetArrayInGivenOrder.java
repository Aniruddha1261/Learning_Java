import java.util.Arrays;

public class CreateTargetArrayInGivenOrder {
    // https://leetcode.com/problems/create-target-array-in-the-given-order/

    // Q: Given two arrays of integers nums and index. Your task is to create target array under the following rules:
    //
    //Initially target array is empty.
    //From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
    //Repeat the previous step until there are no elements to read in nums and index.
    //Return the target array.
    //
    //It is guaranteed that the insertion operations will be valid.
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {int[] list = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int b = index[i];
            for (int j = nums.length - 1; j > -1; j--) {
                if ( b + j + 1 < nums.length ) {
                    list[b + j + 1] = list[b + j];
                }
            }
            list[b] = a;
        }
        return list;
    }
}

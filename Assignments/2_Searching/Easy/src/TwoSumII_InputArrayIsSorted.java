import java.util.Arrays;

public class TwoSumII_InputArrayIsSorted {
    // https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

    // Q: Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
    //Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
    //The tests are generated such that there is exactly one solution. You may not use the same element twice.
    //Your solution must use only constant extra space.

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 4, 9, 56, 90};
        int target = 8;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < numbers.length - 1; i++) {
            int start = i;
            int end = numbers.length - 1;
            if (numbers[i] + numbers[i + 1] == target){
                ans[0] = i + 1;
                ans[1] = i + 2;
                return ans;
            }
            while(start <= end){
                int mid = start + (end - start)/2;
                if (numbers[i] + numbers[mid] == target){
                    ans[0] = i + 1 ;
                    ans[1] = mid + 1;
                    return ans;
                } else if (numbers[i] + numbers[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid -1;
                }
            }
        }
        return ans;
    }

    public static int[] twoSum2(int[] numbers, int target) {
        int[] ans = new int[2];

        return ans;
    }
}

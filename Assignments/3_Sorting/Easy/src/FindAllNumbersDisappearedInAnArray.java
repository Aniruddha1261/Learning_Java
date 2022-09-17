import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    // https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

    // Q: Given an array nums of n integers where nums[i] is in the range [1, n],
    // return an array of all the integers in the range [1, n] that do not appear in nums.
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int k = nums.length - 1;
        while (i < nums.length){
            if (nums[i] > nums.length){
                swap(nums, i, k);
                k--;
            }
            if (nums[i] != i + 1 && nums[nums[i] - 1] != nums[i]){
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1){
                list.add(j + 1);
            }
        }

        return list;
    }

    static void swap(int[] nums, int f, int s){
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }
}

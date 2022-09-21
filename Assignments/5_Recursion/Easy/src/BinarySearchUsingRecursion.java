import java.util.Arrays;

public class BinarySearchUsingRecursion {
    // https://leetcode.com/problems/binary-search/

    // Q: Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
    //
    //You must write an algorithm with O(log n) runtime complexity.
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
         return binary(nums, target, 0, nums.length - 1);
    }

    public static int binary(int[] nums, int target, int start, int end) {
        int mid = start + (end - start)/2;
        if (start > end){
            return -1;
        }
        if (start == end && nums[mid] != target){
            return -1;
        }
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] > target) {
                return binary(nums, target, start, mid - 1);
                //end = mid - 1;
            } else {
                return binary(nums, target, mid + 1, end);
                //start = mid + 1;
            }
    }
}

import java.util.Arrays;

public class SortColors {
    // https://leetcode.com/problems/sort-colors/

    // Q: Given an array nums with n objects colored red, white, or blue, sort them in-place
    // so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
    //We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
    //You must solve this problem without using the library's sort function.
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int i = 0;
        int s = 0;
        int e = nums.length - 1;
        while(i < nums.length ){
            if (nums[i] == 0){
                if (s == i){
                    s++;
                    i++;
                } else {
                    swap(nums, s, i);
                    s++;
                }
            } else if (nums[i] == 2 && i < e) {
                    swap(nums, i, e);
                    e--;
            } else {
                i++;
            }
        }
    }

    static void swap(int[] nums, int f, int s){
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }
}

public class SingleElementInASortedArray {
    // https://leetcode.com/problems/single-element-in-a-sorted-array/

    // Q: You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
    //Return the single element that appears only once.
    //Your solution must run in O(log n) time and O(1) space.
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {

        if (nums.length < 2){
            return nums[0];
        }
        for (int i = 0; i < nums.length; i = i + 2) {
            if (i + 1 == nums.length){
                return nums[i];
            }
            if (nums[i] != nums[i + 1]){
                return nums[i];
            } else {
                continue;
            }
        }

//        int i = 0;
//        int j = nums.length - 1;
//        while(i <= j){
//            if (nums[i] == nums[i + 1]){
//                i = i + 2;
//                if (nums[j - 1] != nums[j]){
//                    return nums[j];
//                }
//            } else if (nums[j - 1] == nums[j]) {
//                j = j - 2;
//                if (nums[i] != nums[ i + 1]){
//                    return nums[i];
//                }
//            }
//        }
        
        return 0;
    }
    
}

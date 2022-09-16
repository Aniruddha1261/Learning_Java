import java.util.Arrays;
public class MajorityElement {
    // https://leetcode.com/problems/majority-element/submissions/

    // Q: Given an array nums of size n, return the majority element.
    //The majority element is the element that appears more than ⌊n / 2⌋ times.
    // You may assume that the majority element always exists in the array.
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int[] nums1 = {4, 5, 4};
        System.out.println(majorityElement2(nums));
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static int majorityElement(int[] nums) {
        // Using Bubble Sort
        // 554 ms taken to run all cases
        if (nums.length < 2){
            return nums[0];
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if (nums[j] < nums[j - 1]){
                    swap(nums, j, j - 1);
                } else {
                    break;
                }
            }
        }
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]){
                count++;
                if (count > nums.length/2){
                    return nums[i];
                }
            } else {
                count = 1;
            }
        }

        return 0;
    }

    public static int majorityElement1(int[] nums) {

        // Using insertion sort
        // 136 ms taken
        if (nums.length < 2){
            return nums[0];
        }
        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 1; j < nums.length ; j++) {
                if (nums[j] < nums[j - 1]){
                    swap(nums, j, j - 1);
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]){
                count++;
                if (count > nums.length/2){
                    return nums[i];
                }
            } else {
                count = 1;
            }
        }
        return 0;
    }

    public static int majorityElement2(int[] nums) {

        // Merge sort used
        // 10 ms taken got best results
        if (nums.length < 2){
            return nums[0];
        }

        mergeSortInPlace(nums, 0, nums.length);

        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]){
                count++;
                if (count > nums.length/2){
                    return nums[i];
                }
            } else {
                count = 1;
            }
        }

        return 0;
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e){
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        while (i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++){
            arr[s + l] = mix[l];
        }
    }


    static void mergeSortInPlace(int[] arr, int s, int e){
        if(e - s == 1){
            return;
        }

        int mid = (s + e) / 2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

}

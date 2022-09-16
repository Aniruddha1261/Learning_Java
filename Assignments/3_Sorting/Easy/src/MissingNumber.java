public class MissingNumber {
    // https://leetcode.com/problems/missing-number/

    // Q: Given an array nums containing n distinct numbers in the range [0, n],
    // return the only number in the range that is missing from the array.
    public static void main(String[] args) {
        int[] nums = {0, 2, 3};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        if (nums.length < 2 && nums[0] != 0){
            return 0;
        } else if (nums.length < 2 && nums[0] == 0){
            return nums.length;
        }

        mergeSortInPlace(nums, 0, nums.length);

        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i){
                return i;
            } else {
                i++;
            }
        }

        return nums.length;
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

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

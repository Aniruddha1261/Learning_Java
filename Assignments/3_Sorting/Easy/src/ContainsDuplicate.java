public class ContainsDuplicate {
    // https://leetcode.com/problems/contains-duplicate/

    // Q: Given an integer array nums, return true if any value appears at least twice in the array,
    // and return false if every element is distinct.
    public static void main(String[] args) {
        int[] nums = {3, 3};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length < 2){
            return false;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]){
                    swap(nums, j, j - 1);
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]){
                    return true;
            }
        }

        return false;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static boolean containsDuplicate1(int[] nums) {
        if (nums.length < 2){
            return false;
        }

        mergeSortInPlace(nums, 0, nums.length);

        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]){
                count++;
                if (count == 2){
                    return true;
                }
            }
        }

        return false;
    }

    public static void mergeInPlace(int[] arr, int s, int m, int e){
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


    public static void mergeSortInPlace(int[] arr, int s, int e){
        if(e - s == 1){
            return;
        }

        int mid = (s + e) / 2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }
}

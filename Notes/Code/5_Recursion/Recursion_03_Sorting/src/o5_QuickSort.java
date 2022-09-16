import java.util.Arrays;

public class o5_QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
    }

    static void quick(int[] nums, int low, int high){
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while(s <= e){
            // also a reason why if its already sorted it will not swap
            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = nums[e];
                nums[e] = nums[s];
                nums[s] = temp;
                s++;
                e--;
            }
        }

        //now my pivot is at correct index, please sort two halves
        quick(nums, low, e);
        quick(nums, s, high);
    }
}

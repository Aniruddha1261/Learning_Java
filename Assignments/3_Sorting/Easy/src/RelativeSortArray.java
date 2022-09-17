import java.util.Arrays;

public class RelativeSortArray {
    // https://leetcode.com/problems/relative-sort-array/

    // Q: Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
    //Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.
    // Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        int k = 0;
        int[] ans = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            int j = 0;
            while(j < arr1.length && k < arr1.length) {
                if (arr2[i] != arr1[j]){
                    j++;
                } else {
                    ans[k] = arr1[j];
                    arr1[j] = -1;
                    k++;
                    j++;
                }
            }
        }

        Arrays.sort(arr1);
        int x = 0;
        while(k < arr1.length){
            if (arr1[x] != -1) {
                ans[k] = arr1[x];
                k++;
            }
            x++;
        }

        return ans;
    }
}

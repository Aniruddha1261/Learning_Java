import java.util.ArrayList;
import java.util.List;

public class KthMissingPositiveNumber {
    // https://leetcode.com/problems/kth-missing-positive-number/

    // Q: Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
    //Return the kth positive integer that is missing from this array.

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }

    public static int findKthPositive(int[] arr, int k) {

        int count = 0;
        int j = 0;
        for (int i = 0; i < arr.length + k; i++) {
            if (j < arr.length) {
                if (arr[j] != i + 1) {
                    count++;
                } else {
                    j++;
                }
                if (count == k){
                    return i + 1;
                }
            } else {
                count++;
                if (count == k){
                    return i + 1;
                }
            }
        }
        return 0;
    }
}

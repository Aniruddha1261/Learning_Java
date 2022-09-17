import java.util.Arrays;

public class HeightChecker {
    // https://leetcode.com/problems/height-checker/

    // Q: A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line
    // in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
    //You are given an integer array heights representing the current order that the students are standing in.
    // Each heights[i] is the height of the ith student in line (0-indexed).
    //Return the number of indices where heights[i] != expected[i].

    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(heights));

    }

    public static int heightChecker(int[] heights) {
        int count = 0;
        int[] expected = mergeSort(heights);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]){
                count++;
            }
        }
        return count;
    }

    static int[] mergeSort(int[] arr){
        if (arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}

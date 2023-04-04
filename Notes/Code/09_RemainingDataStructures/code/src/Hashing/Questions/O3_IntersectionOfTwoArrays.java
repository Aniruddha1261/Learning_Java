package Hashing.Questions;

import java.util.HashSet;
import java.util.Iterator;

public class O3_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 ={7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};
        System.out.println(intersection(arr1, arr2));
    }

    // Create HashSet
    // for(int i = 0 to n){ set.add(arr[i]); }
    // for(int j = 0 to n2){
    //           if (set1.contains(arr2[i])){
    //                System.out.print(arr2[i] + " ");
    //                set1.remove(arr2[i]);
    //                count++;
    //            }
    // }
    // return count;
    public static int intersection(int[] arr1, int[] arr2){
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (set1.contains(arr2[i])){
                System.out.print(arr2[i] + " ");
                set1.remove(arr2[i]);
                count++;
            }
        }
        System.out.println();
        return count;
    }
}

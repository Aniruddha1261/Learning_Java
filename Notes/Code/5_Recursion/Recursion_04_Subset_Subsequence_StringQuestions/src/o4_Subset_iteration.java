import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class o4_Subset_iteration {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subset(arr);
//        System.out.println(ans);
        for (List<Integer> list: ans) {
            //System.out.println(list);
        }

        int[] arr2 = {1, 2, 2};
        List<List<Integer>> ans2 = subsetDup(arr2);
//        System.out.println(ans);
        for (List<Integer> list: ans2) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num: arr){
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }


    static List<List<Integer>> subsetDup(int[] arr){
        // if the array contains duplicate elements
        //when you find duplicate element, only add it in the newly created subset of previous step.
        //Because of the above point duplicates have to be together
        // => Sort the array
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++){
            start = 0;
            // if current and previous element is same, start = end + 1
            if (i > 0 && arr[i] == arr[i - 1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}

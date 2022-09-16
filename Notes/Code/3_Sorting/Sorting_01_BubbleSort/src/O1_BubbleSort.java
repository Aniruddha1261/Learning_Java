import java.util.Arrays;

public class O1_BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 6, 3, 5};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Bubble(int[] arr){
        boolean swapped;
        // Run the steps n - 1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;

            // for each step, max item will come at the last respective index

            for (int j = 1; j < arr.length; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j -1 ]){
                    int temp = arr[j];
                    arr[j] = arr[j -1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            // if you did not swap for a particular value of i it means
            // the array is sorted hence stop the program
            if (!swapped){ // !false = true
                break;
            }
        }
    }
}

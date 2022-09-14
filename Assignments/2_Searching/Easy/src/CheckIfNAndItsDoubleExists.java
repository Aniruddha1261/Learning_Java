public class CheckIfNAndItsDoubleExists {
    // https://leetcode.com/problems/check-if-n-and-its-double-exist/

    // Q: Given an array arr of integers, check if there exist two indices i and j such that :
    //i != j
    //0 <= i, j < arr.length
    //arr[i] == 2 * arr[j]
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i]){
                    return true;
                }
            }
        }
        return false;
    }
}

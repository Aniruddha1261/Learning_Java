public class MinJump {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 2};
        int m = 2;
        int n = 5;
        System.out.println(ans(arr, m -1, n-1));
    }

    public static boolean ans(int[] arr, int m, int n) {
        if (m == n){
            return true;
        }
        if (arr[m] == 0) {
            return false;
        }
        if(m != n){
            return ans(arr, m + arr[m], n) || ans(arr, m + arr[m] -1, n);
        }
        return false;
    }
}

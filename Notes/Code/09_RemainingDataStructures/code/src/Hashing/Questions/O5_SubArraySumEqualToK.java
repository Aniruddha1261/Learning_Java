package Hashing.Questions;

import java.util.HashMap;

public class O5_SubArraySumEqualToK {
    // arr = {1, 2, 3} K = 3  return  number of such subArrays
    // ans = 2 (1, 2)(3)

    // Nested Loop  -> O(N^3)
    // prefix Array -> O(N^2)

    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10}; // ans = 3
        subArraySum(arr, -10);

    }


    // sum - K = sub(i - 1)
    public static void subArraySum(int[] arr, int K){
        // HashMap
        // Key -> SUM
        // Val -> Frequency , How many times sum = K appeared

        // 1) HashMap<Int = sum, Int = freq>
        //    map.put(0, 1) <- empty subArray
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // empty subArray


        // 2) Loop for j 0 to n
        //    if (sum - k -> exists in map)
        //        ans += map.get(sum - k)
        //        sum -> map exists (freq + 1) else freq = 1
        int ans = 0;
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];

            if (map.containsKey(sum - K)){
                ans += map.get(sum - K);
            }
            if (map.containsKey(sum)){
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        System.out.println(ans);
    }
}
package Hashing.Questions;
import java.util.HashMap;
import java.util.Map;

public class O1_MajorityElement {
    // Given an integer array of size n, find all the elements that appear more than [n/3] times.
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 5, 1, 3, 1, 5, 1}; // ans = 1
        int[] arr2 = {1, 2};                      // ans = 1, 2.
        majorityElement(nums);
    }

    public static void majorityElement(int nums[]){
        // We use HashMap here
        //key   = number
        //value = frequency

        // 1 -> Create HashMap<Integer, Integer> map = new HashMao<>();
        // 2 -> Find frequency of all numbers and store it in HashMap
        // 3 -> Traverse the map and check the frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        System.out.println(map);
//        for (Map.Entry<Integer, Integer> e : map.entrySet()){
//            if (e.getValue() >= n/ 3){
//                System.out.println(e.getKey());
//            }
//        }
        for(int key : map.keySet()){
            if (map.get(key) >= n/3){
                System.out.println(key);
            }
        }
    }
}

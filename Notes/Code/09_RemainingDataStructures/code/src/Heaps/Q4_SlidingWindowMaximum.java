package Heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

// Maximum of all Sub-arrays of Size K
public class Q4_SlidingWindowMaximum {
    public static void main(String[] args) { // O(nlogK)
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;  // ans = 3, 3, 5, 5, 6, 7
        int[] result = new int[arr.length - k + 1];  // n - k + 1

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }

        result[0] = pq.peek().value;

        for (int i = k; i < arr.length; i++) {
            while (pq.size() > 0 && pq.peek().idx <= i - k){
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            result[i - k + 1] = pq.peek().value;
        }


        System.out.println(Arrays.toString(result));
    }

    static class Pair implements Comparable<Pair>{
        int value;
        int idx;

        public Pair(int value, int idx) {
            this.value = value;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2) {
            return p2.value - this.value; // descending order
        }
    }
    /*
     At-max you can store k elements in priority-queue at a time - (Max Heap)
     Create a Result Array of size -> (N - k + 1)

     1) Add K numbers to PQ(1'st Window)
     2) PQ.peek -> window[0]

     3) if the index of the element in PQ becomes less than equal to (i -k)
        - while(pq.peek().idx <= (i - k))
            pr.remove()
        pq.add(curr)
        wind[] = pq.peek()
     */

}

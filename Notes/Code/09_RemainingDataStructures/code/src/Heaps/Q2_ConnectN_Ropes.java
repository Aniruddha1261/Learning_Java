package Heaps;

import java.util.PriorityQueue;

// Given are N ropes of different lengths, the task is to connect these ropes into one rope with
// minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.
public class Q2_ConnectN_Ropes {
    public static void main(String[] args) {
        int[] ropes = {4, 3, 3, 2, 6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        int cost = 0;
        while (pq.size() > 1){
            int min = pq.remove();
            int min2 = pq.remove();
            cost += min + min2;
            pq.add(min + min2);
        }

        System.out.println("Cost of connecting n ropes = " + cost);
    }

}

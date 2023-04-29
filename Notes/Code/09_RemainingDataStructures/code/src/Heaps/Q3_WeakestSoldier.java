package Heaps;

import java.util.PriorityQueue;

// We are given an (M x N) of 1's(soldiers) and 0's(civilians).
// The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.
// A row i is weaker than a row j if one of the following is true:
//  - The number of soldiers in row i is less than the number of soldiers in row j.
//  - Both the rows have the same number of soldiers and i < j.
// Find the K the weakest rows.
public class Q3_WeakestSoldier {
    public static void main(String[] args) {
        int[][] army = {
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}
        };
        int k = 2;
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[i].length; j++) {
                count += army[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(count, i));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("R" + pq.remove().idx);
        }
    }

    static class Row implements Comparable<Row> {

        int soldiers;
        int idx;

        public Row(int soldiers, int idx) {
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.soldiers == r2.soldiers) {
                return this.idx - r2.idx;
            } else {
                return this.soldiers - r2.soldiers;
            }
        }
    }
}

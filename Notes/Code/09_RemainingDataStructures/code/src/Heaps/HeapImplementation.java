package Heaps;

import java.util.ArrayList;

public class HeapImplementation {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(2);
        heap.add(3);
        heap.add(4);
        heap.add(5);
        heap.add(10);
        heap.add(6);
        System.out.println(heap);
        while (!heap.isEmpty()){  // Heap Sort
            System.out.println(heap.peek());
            heap.remove();
        }

    }

    static class Heap {
        @Override
        public String toString() {
            return arr + "";
        }

        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            // add at last idx
            arr.add(data);

            int x = arr.size() - 1; // Child index
            int par = (x - 1)/2; // parent index

            while (arr.get(x) < arr.get(par)){  // O(logn) : you only need to travel the height of the tree in the worst case
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){  // O(Log(n)) --> traversing at max height of the tree
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }
            if (right < arr.size() && arr.get(minIdx) > arr.get( right)){
                minIdx = right;
            }

            if (minIdx != i){
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove(){
            int data = arr.get(0);

            // step 1 : SWAP first & last;
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() -1) );
            arr.set(arr.size() - 1, temp);

            // Step 2 : delete last
            arr.remove(arr.size() - 1);

            // Step3 - heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }
}

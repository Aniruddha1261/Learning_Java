import java.util.ArrayList;
import java.util.Arrays;

public class LL {

    public static void main(String[] args) {
        Node end = new Node(0, null);
        Node mid10 = new Node(10, end);
        Node mid9 = new Node(9, mid10);
        Node mid8 = new Node(8, mid9);
        Node mid7 = new Node(7, mid8);
        Node mid6 = new Node(6, mid7);
        Node mid5 = new Node(5, mid6);
        Node mid4 = new Node(4, mid5);
        Node mid3 = new Node(3, mid4);
        Node mid2 = new Node(2, mid3);
        Node mid1 = new Node(1, mid2);
        Node head = new Node(40, mid1);

        Node ptr = head;
        while (ptr != null){
            System.out.print(ptr);
            ptr = ptr.next;
        }


        int l = 12;
        System.out.println();
        Node pointer = head;
        int length = l - 2;
        float[] arr = new float[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (pointer.data + pointer.next.data) / (i + 1);
            pointer = pointer.next;
        }

        System.out.println(Arrays.toString(arr));

        // (length - i) steps to reach the max value index * 0.5 min
        // (i + 1) * 5 min between switch

        int pos = position(arr, l);
    }

    public static int max(float[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static int position(float[] arr, int l) {
        while (true) {
            int idx = max(arr) + 1;
            double time = 5.0 * (idx);
            if (time > (float)((l - idx - 1)*0.5)){
                return idx;
            } else {
                arr[idx - 1] = 0;
            }
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return data + " -> ";
    }
}
package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

// Priority Queue Implementation
public class PQ {
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // Comparator.reverseOrder(); --> reverse the order
        pq.add(new Student("A", 1)); // O(logn)
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 3));
        pq.add(new Student("D", 18));
        pq.add(new Student("E", 6));

        while (!pq.isEmpty()){
            System.out.println(pq.peek()); // O(1)
            pq.remove();  //O(logn)
        }
    }

    static class Student implements Comparable<Student>{ // overriding
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }


        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", rank=" + rank +
                    '}';
        }
    }
}

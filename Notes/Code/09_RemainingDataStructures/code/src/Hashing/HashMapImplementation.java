package Hashing;

import java.util.*;
import java.util.LinkedList;

public class HashMapImplementation {
    // Internally implemented as Array of LL
    static class HashMap<K, V> { // generics
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n - nodes
        private int N; // N - buckets
        //    private int arr[]; // just like this we write the below line
        private LinkedList<HashMap.Node> buckets[]; // N = buckets.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<HashMap.Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];
            for (int i = 0; i < N * 2; i++) {
                buckets[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<HashMap.Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        private int hashFunction(K key) { // 0 to N - 1
            int bi = key.hashCode();
            // can output 234567 , -234567 ,but we only want positive value
            return Math.abs(bi) % N; // 0 to N - 1
        }

        private int searchInLL(K key, int bi) {
            LinkedList<HashMap.Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i; //di
                }
            }
            return -1;
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // data index
            // di = valid (0 +)
            if (di == -1) { // key doesn't exist
                buckets[bi].add(new Node(key, value));
                n++;
            } else { // key exists
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                // rehashing
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // data index
            // di = valid (0 +)
            if (di == -1) { // key doesn't exist
                return false;
            } else { // key exists
                Node node = buckets[bi].get(di);
                return true;
            }
        }

        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // data index
            // di = valid (0 +)
            if (di == -1) { // key doesn't exist
                return null;
            } else { // key exists
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // data index
            // di = valid (0 +)
            if (di == -1) { // key doesn't exist
                return null;
            } else { // key exists
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public boolean isEmpty() {
            return n == 0;
        }

        public ArrayList<K> keySet(){
            ArrayList<K> key = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<HashMap.Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    key.add(node.key);
                }
            }
            return key;
        }
    }


    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 150);
        ArrayList<String> keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }
        map.remove("India");
        System.out.println(map.get("India"));
    }
}
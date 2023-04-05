package Tries;

public class Trie {

    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(search("the"));
        System.out.println(search("annu"));
        System.out.println(search("an"));
    }

    static Node root = new Node();
    static class Node{
        Node[] children;
        boolean endOfWord;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            endOfWord = false;
        }
    }

    public static void insert(String word){
        Node curr = root;
        for (int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null){
                // add new node
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1){
                curr.children[idx].endOfWord = true;
            }
            curr = curr.children[idx];
        }
    }

    public static boolean search(String key){
        Node curr = root;
        for (int i = 0; i < key.length(); i++){ // O(L) -> Length of String
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];
            if (node == null){
                return false;
            }
            if (i == key.length() - 1 && node.endOfWord == false){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
}

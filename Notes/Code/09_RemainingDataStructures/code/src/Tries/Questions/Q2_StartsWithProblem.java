package Tries.Questions;

import Tries.Trie;

public class Q2_StartsWithProblem {
    // Create a function boolean startsWith(String prefix) for a trie.
    // Returns true if there is a previously inserted string word that has the prefix-prefix, and false otherwise
    public static void main(String[] args) {
        String[] words = {"apple", "app", "mango", "man", "woman"};
        String prefix = "app";  //output: true
        String prefix2 = "wom";//output: true
        String prefix3 = "moon";//output: falseZ

        for (int i = 0; i < words.length; i++) {
            Trie.insert(words[i]);
        }
        System.out.println(startsWith(prefix));
        System.out.println(startsWith(prefix2));
        System.out.println(startsWith(prefix3));
    }

    public static boolean startsWith(String prefix){
        Trie.Node curr = Trie.root;
        for (int i = 0; i < prefix.length(); i++){ // O(L) -> Length of String
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
}

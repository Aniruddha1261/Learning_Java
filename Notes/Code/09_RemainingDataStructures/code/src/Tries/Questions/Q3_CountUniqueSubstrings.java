package Tries.Questions;

import Tries.Trie;

public class Q3_CountUniqueSubstrings {
    // Given a string of length n of lowercase alphabet characters,
    // we need to count total numbers of distinct substrings of this string.

    public static void main(String[] args) {
        String str = "ababa"; // ans = 10

        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            System.out.println(suffix);
            Trie.insert(suffix);
        }
        System.out.println(countNode(Trie.root));
    }

    public static int countNode(Trie.Node root){
        if (root == null){
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null){
                count += countNode(root.children[i]);
            }
        }
        return count + 1;
    }
}

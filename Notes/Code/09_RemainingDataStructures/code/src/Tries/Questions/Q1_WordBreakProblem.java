package Tries.Questions;

import Tries.Trie;

public class Q1_WordBreakProblem {
    // Given an input string and a dictionary of words, find out if the string
    // can be broken into a space-separated sequence of dictionary words.

    public static void main(String[] args) {
        String[] words = {"i", "like", "sam", "samsung", "mobile", "ice"};
        String key = "ilikesamsung"; // ans true

        for (int i = 0; i < words.length; i++) {
            Trie.insert(words[i]);
        }
        System.out.println(wordBreak(key));
    }

    public static boolean wordBreak(String key){
        if (key.length() == 0){
            return true;
        }

        for (int i = 1; i <= key.length(); i++) {
            String firstPart = key.substring(0, i);
            String secondPart = key.substring(i);
            if (Trie.search(firstPart) && wordBreak(secondPart)){
                return true;
            }
        }
        return false;
    }
}

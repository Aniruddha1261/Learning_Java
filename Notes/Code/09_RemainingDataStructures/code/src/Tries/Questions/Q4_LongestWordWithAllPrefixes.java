package Tries.Questions;
import Tries.Trie;

public class Q4_LongestWordWithAllPrefixes {
    public static void main(String[] args) {
        // Find the longest string in words such that every prefix of it is also in words.
        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"}; // ans = "apple"
        for (int i = 0; i < words.length; i++) {
            Trie.insert(words[i]);
        }
        longestWord(Trie.root, new StringBuilder(""));
        System.out.println(ans);
    }

    public static String ans = "";

    public static void longestWord(Trie.Node root, StringBuilder temp){
        if (root == null){
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].endOfWord == true){
                temp.append((char)(i + 'a'));
                if (temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }
}
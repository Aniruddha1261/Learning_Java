package InterviewQuestions;
// Q5: https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/submissions/
import java.util.Stack;

public class O5_MinimumAddToMakeParenthesesValid {
    public static void main(String[] args) {

    }

    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if (ch == ')'){
                if (!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }

        return stack.size();
    }
}

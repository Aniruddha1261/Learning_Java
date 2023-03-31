package InterviewQuestions;
// Q6: https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/

import java.util.Stack;

public class O6_MinimumInsertionsToBalanceAParenthesesString {

    public static void main(String[] args) {
        String s = ")))))))";
        String s2 = "())";
        String s3 = "))())(";
        String s4 = "(()))(()))()())))";
        System.out.println(minInsertions(s));   // answer should be 1
        System.out.println(minInsertions(s2));  // answer should be 0
        System.out.println(minInsertions(s3));  // answer should be 3
        System.out.println(minInsertions(s4));  // answer should be 4  --> coming wrong "1"
    }

    public static int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == ')') {
                    stack.pop();
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(')');
                        stack.push(')');
                    }
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }
        System.out.println(stack);
        int countLeft = 0;
        int countRight = 0;
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                countRight += 2;
                stack.pop();
            } else if (stack.pop() == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                    countRight++;
                } else if (!stack.isEmpty() && stack.pop() == ')') {
                    countLeft++;
                } else {
                    countLeft++;
                    countRight++;
                }
            }
        }
        return countRight + countLeft;
    }
}

package InterviewQuestions;
// Q3: https://leetcode.com/problems/largest-rectangle-in-histogram/
import java.util.Stack;

public class O3_LargestRectangleInHistogram {
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        int ans = largestRectangleArea(heights);
        System.out.println(ans);
    }

    // ???? Not understood the solution
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;

        stack.push(0);

        for (int i = 1; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]){
                max = getMax(heights, stack, max, i);
            }
            stack.push(i);
        }
        int i = heights.length;
        while (!stack.isEmpty()){
            max = getMax(heights, stack, max, i);
        }
        return max;
    }

     public static int getMax(int[] arr, Stack<Integer> stack, int max, int i){
        int area;
        int popped = stack.pop();
        if (stack.isEmpty()){
            area = arr[popped] * i;
        } else {
            area = arr[popped] * (i - 1 - stack.peek());
        }
        return Math.max(max, area);
     }

    public static int largestRectangleAreaSelf(int[] heights) {
        Stack<Integer> ans = new Stack<>();
        int area = 0;
        for (int i = 0; i < heights.length; i++) {
            int min = heights[i];
            for (int j = i; j < heights.length; j++) {
                min = Math.min(min, heights[j]);
                area = min * (j - i + 1);
                ans.push(area);
            }
        }
        int maxArea = 0;
        while (!ans.isEmpty()){
            maxArea = Math.max(maxArea, ans.pop());
        }
        return maxArea;
    }
}

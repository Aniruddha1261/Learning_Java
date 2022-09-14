import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Optimization left

public class MaxValueOfEquation {
    // https://leetcode.com/problems/max-value-of-equation/

    // Q: You are given an array points containing the coordinates of points on a 2D plane, sorted by the x-values,
    // where points[i] = [xi, yi] such that xi < xj for all 1 <= i < j <= points.length. You are also given an integer k.
    //Return the maximum value of the equation yi + yj + |xi - xj| where |xi - xj| <= k and 1 <= i < j <= points.length.
    //It is guaranteed that there exists at least one pair of points that satisfy the constraint |xi - xj| <= k.

    public static void main(String[] args) {
        int[][] points = {
                {-19, 9},
                {-15, -19},
                {-5, -8}
                //{6, -10}
        };
        int k = 10;
        System.out.println(findMaxValueOfEquation(points, k));
    }

    public static int findMaxValueOfEquation(int[][] points, int k) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            int xi = points[i][0];
            int yi = points[i][1];
            int num;
            for (int j = i + 1; j < points.length; j++) {
                int xj = points[j][0];
                int yj = points[j][1];

                int z = Math.abs(xi - xj);
                if (z <= k) {
                    num = yi + yj + Math.abs(z);
                    list.add(num);
                }
            }
        }

        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= max){
                max = list.get(i);
            }
        }

        return max;
    }
}

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {
    // https://leetcode.com/problems/lucky-numbers-in-a-matrix/

    // Q: Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
    //A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
    public static void main(String[] args) {
        int[][] matrix = {
                { 3,7,8},
                { 9,11,13},
                {15,16,17}
        };
        List<Integer> ans = luckyNumbers(matrix);
        System.out.println(ans);
    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
       List<Integer> ans = new ArrayList<>();
       int[] maximum = new int[matrix[0].length];
       int[] ind = new int[matrix.length];

       // Calculating the minimum no from the row and storing it index in ind[] array
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int index = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min){
                    min = matrix[i][j];
                    index = j;
                }
            }
            ind[i] = index;
        }

        // calculating maximum no of the column and store it in maximum[] array
        for (int j = 0; j < matrix[0].length; j++) {
            int max = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
            maximum[j] = max;
        }

        // check whether the lowest no of row is the largest of the column
        for (int j = 0; j < ind.length; j++) {
            if (matrix[j][ind[j]] >= maximum[ind[j]]){
                ans.add(matrix[j][ind[j]]);
            }
        }
       return ans;
    }
}


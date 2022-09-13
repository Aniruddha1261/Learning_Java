import java.util.ArrayList;
import java.util.Arrays;

public class ReshapeTheMatrix {
    // https://leetcode.com/problems/reshape-the-matrix/

    // Q: In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
    //You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted re-shaped matrix.
    //The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
    //If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;
        int[][] ans = matrixReshape(mat, r, c);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if(row*col != r*c){
            return mat;
        }
        int[][] ans = new int[r][c];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                list.add(mat[i][j]);
            }
        }

        int k = 0;
        if (k <= r*c) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    ans[i][j] = list.get(k);
                    k++;
                }
            }
        }
        return ans;
    }
}

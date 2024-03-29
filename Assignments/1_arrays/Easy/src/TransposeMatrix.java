import java.util.Arrays;

public class TransposeMatrix {
    // https://leetcode.com/problems/transpose-matrix/

    // Q: Given a 2D integer array matrix, return the transpose of matrix.
    //The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] ans = transpose(matrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int col = matrix.length;
        int row = matrix[0].length;
        int[][] transpose = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }

}

import java.util.Arrays;

public class CellsWithOddValuesInAMatrix {
    // https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

    // Q: There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where
    // each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.
    //For each location indices[i], do both of the following:
    //Increment all the cells on row ri.
    //Increment all the cells on column ci.
    //Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0, 1},{1, 1}};
        System.out.println(oddCells(m, n, indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int[][] mat = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            int no1 = indices[i][0];
            int no2 = indices[i][1];

            for (int j = 0; j < mat.length; j++) {
                mat[j][no2] += 1;
               // mat[no1][j] += 1;
            }
            for (int j = 0; j < mat[0].length; j++) {
                mat[no1][j] += 1;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] % 2 == 1){
                    count++;
                }
            }
        }

        return count;
    }
}

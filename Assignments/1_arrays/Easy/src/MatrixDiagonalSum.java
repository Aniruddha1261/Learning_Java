public class MatrixDiagonalSum {
    // https://leetcode.com/problems/matrix-diagonal-sum/

    // Q: Given a square matrix mat, return the sum of the matrix diagonals.
    //Only include the sum of all the elements on the primary diagonal and all
    // the elements on the secondary diagonal that are not part of the primary diagonal.
    public static void main(String[] args) {
        int[][] mat = { {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        System.out.println(diagonalSum(mat));
        System.out.println(diagonalSum1(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int index1 = 0;
        int index2 = mat.length - 1;

        if (mat.length == 1){
            return mat[0][0];
        }else {
            if (index1 <= index2) {
                for (int i = 0; i < mat.length; i++) {
                    sum = sum + mat[index1][index2];
                    index2--;
                    index1++;
                    if (index1 == index2 && mat.length != 1) {
                        sum = sum - mat[index1][index2];
                    }
                    for (int j = 0; j < mat.length; j++) {
                        if (i == j) {
                            sum = sum + mat[i][j];
                        }
                    }
                }
            }
        }
//        if (index1 == index2){
//            sum = sum + mat[index1][index2];
//        }

        return sum;
    }

    public static int diagonalSum1(int[][] mat) {
        int sum = 0;
        int index1 = 0;
        int index2 = mat.length - 1;

        if (mat.length == 1){
            return mat[0][0];
        }else {
            if (index1 <= index2) {
                for (int i = 0; i < mat.length; i++) {
                    sum = sum + mat[index1][index2];
                    index1++;
                    index2--;

                    if (index1 == index2) {
                        sum = sum - mat[index1][index2];
                    }
//                    for (int j = 0; j < mat.length; j++) {
//                        if (i == j) {
//                            sum = sum + mat[i][j];
//                        }
//                    }
                    sum = sum + mat[i][i];

                }

            }
        }
//        if (index1 == index2){
//            sum = sum + mat[index1][index2];
//        }

        return sum;
    }
}

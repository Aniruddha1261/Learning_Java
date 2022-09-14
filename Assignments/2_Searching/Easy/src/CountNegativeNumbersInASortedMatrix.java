public class CountNegativeNumbersInASortedMatrix {
    // https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

    // Q: Given an m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise,
    // return the number of negative numbers in grid.
    public static void main(String[] args) {
//        int[][] grid = {
//                {4, 3, 2, -1},
//                {3, 2, 1, -1},
//                {1, 1, -1, -2},
//                {-1, -1, -2, -3}
//        };
//        int[][] grid = {
//                {3, 2},
//                {1, 0}
//        };
        int[][] grid = {
                {3,-1,-3,-3,-3},
                {2,-2,-3,-3,-3},
                {1,-2,-3,-3,-3},
                {0,-3,-3,-3,-3}
        };
        System.out.println(countNegatives1(grid));
        System.out.println(countNegatives(grid));
    }

    public static int countNegatives1(int[][] grid) {
        // brute force solution
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col ; j++) {
                if (grid[i][j] >= 0){
                    count++;
                }
            }
        }

        return  (row * col) - count;
    }

    public static int countNegatives(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            int count = 0;
            int start = 0;
            int end = grid[i].length - 1;
            while(start <= end){
                int mid = start + (end - start)/2;
                if(grid[i][mid] < 0){
                    if (start == mid){
                        count += start;
                        end = mid - 1;
                    }
                    else if (grid[i][start] >= 0){
                        start = start + 1;
                    } else if (grid[i][start] < 0) {
                        count += start;
                        end = start - 1;
                    }
                } else if (grid[i][mid] >= 0){
                    if (start == end){
                        count += start + 1;
                        end -= 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
            sum += count;
        }
        return (grid.length * grid[0].length) - sum;
    }
}

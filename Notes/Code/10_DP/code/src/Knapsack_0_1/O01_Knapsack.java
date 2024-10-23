package Knapsack_0_1;

import java.util.Arrays;

public class O01_Knapsack {

    public static void main(String[] args) {
        int[] wt = {4, 5, 1};
        int[] val = {1, 2, 3};
        int W = 4;
        int n = val.length;
        int[][] t = new int[wt.length + 1][W + 1];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                t[i][j] = -1;
            }
        }
        for (int[] ints : t) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println();
//        System.out.println(knapsack(wt, val, W, n)); // Recursive
//        System.out.println(knapsack1(wt, val, W, n, t)); // Memoization
        System.out.println(knapsack3(wt, val, W, n)); // tabulation
    }


    // Recursive
    public static int knapsack(int[] wt, int[] val, int W, int n){

        if (W==0 || n == 0){
            return 0;
        }

        if (wt[n - 1] <= W){
            return Math.max(val[n - 1] + knapsack(wt, val, W - wt[n- 1], n - 1), knapsack(wt, val, W, n - 1));
        } else {
            return knapsack(wt, val, W, n - 1);
        }
    }

    // Memoization

    public static int knapsack1(int[] wt, int[] val, int W, int n, int[][] t){
        for (int i = 0; i < t.length; i++) {
            System.out.println(Arrays.toString(t[i]));
        }
        System.out.println();
        if (n == 0 || W == 0){
            return 0;
        }

        if (t[n][W] != -1){
            return t[n][W];
        }

        if (wt[n-1] <= W){
            return t[n][W] =  Math.max(val[n-1] + knapsack1(wt, val, W - wt[n - 1], n - 1, t), knapsack1(wt, val, W, n - 1, t));
        } else {
            return knapsack1(wt, val, W, n - 1, t);
        }
    }

    public static int knapsack3(int[] wt, int[] val, int W, int n){
        int[][] t = new int[n + 1][W + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                if (i == 0 || j == 0){
                    t[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {

                if (wt[i -1] <= j){
                    t[i][j] = Math.max(val[i-1] + t[i-1][j - wt[i - 1]], t[i - 1][j]);
                }
                else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][W];
    }
}

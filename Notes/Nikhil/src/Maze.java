import java.util.Arrays;
import java.util.Scanner;

public class Maze {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input m");
        int m = sc.nextInt();

        System.out.println("Input n");
        int n = sc.nextInt();

        int[] arr2 = new int[m*n];
        for (int i = 0; i < m * n; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr2));

        maze2(m, n, arr2);
//
//        int[][] arr = new int[3][3];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
//        maze(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }

//        int[][] arr = new int[3][3];
//        int a = 1;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                arr[i][j] = a;
//                a += 1;
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
//        System.out.println();
//        maze2(arr);
//        System.out.println();
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
    }

    public static void maze(int[][] arr){
        for (int i = 1; i < arr.length; i += 2) {
            for (int j = 0; j < arr[0].length / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr[0].length - 1 - j];
                arr[i][arr[0].length - 1 - j] = temp;
            }
        }

        // Transpose function

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void maze2(int m, int n, int[] arr2){
        int[][] arr = new int[m][n];
        int s = 0;
        int e = arr.length - 1;
        int i = 0;
        int j = 0;
        int count = 0;
        while (count < m * n){
            if (i == s){
                if (j != 0){
                    j+=1;
                }
                while (i < arr.length){
                    arr[i][j] = arr2[count];
                    count++;
                    i++;
                }
                i--;
            }
            if (i == e){
                if (j < arr.length - 1){
                    j+=1;
                }
                else {
                    break;
                }
                while (i >= 0){
                    arr[i][j] = arr2[count];
                    count++;
                    i--;
                }
                i++;
            }
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.println(Arrays.toString(arr[k]));
        }
    }

}

import java.util.Arrays;

public class FlippingAnImage {
    // https://leetcode.com/problems/flipping-an-image/

    // Q: Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
    //To flip an image horizontally means that each row of the image is reversed.
    //For example, flipping [1,1,0] horizontally results in [0,1,1].
    //To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
    //For example, inverting [0,1,1] results in [1,0,0].
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0},
                         {1, 0, 1},
                         {0, 0, 0}};

        int [][] ans = flipAndInvertImage(image);
        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] store = new int[image.length][image.length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                store[i][j] = image[i][image.length -1 - j];
                if (store[i][j] == 1){
                    store[i][j] = 0;
                } else{
                    store[i][j] = 1;
                }
            }
        }
        return store;
    }
}

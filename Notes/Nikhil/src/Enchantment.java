import java.util.Arrays;

public class Enchantment {
    public static void main(String[] args) {
        int n = 2;
        String s = "abcdefghijklmnopqrstuvwxyz";

        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(((int)(arr[i]) - 96) + " ");
        }
        System.out.println();
        System.out.println(code(arr));
    }

    public static boolean code(char[] arr){
        int i = 0;
        while (i < arr.length / 2){
            if (((int)arr[arr.length - 1 - i] + (int)arr[i]) - 96*2  != 27){
                return false;
            } else if ((int)arr[arr.length - 1 - i] < (int)arr[i]){
                return false;
            }
            i++;
        }
//        System.out.println("Correct");
        return true;
    }
}

import java.security.PublicKey;
import java.util.*;

public class Nikhil {
    public static void main(String[] args) {
        // 0932654
        // 4562390

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        sc.close();

        String str1 = "0932654";
        String str2 = "4562390";
        int a = subString(str, str1);
        int b = subString(str, str2);

        System.out.println(a + b);
    }

    public static int subString(String str, String str1){
        int count = 0;
        int index = 0;

        List<Integer> indices = new ArrayList<>();
        while ((index = str.indexOf(str1, index))  != -1){
            count++;
            indices.add(index);
            index++;
        }

        return count;
    }
}

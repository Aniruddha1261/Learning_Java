import java.util.ArrayList;

public class o7_DiceProblem {

    // Amazon
    // [1, 2, 3, 4, 5, 6]
    // make no 4
    // ans = [ 1111, 112, 22, 13, 4 ...]
    public static void main(String[] args) {
        dice("", 7);
        System.out.println(diceRet("", 7));
//        diceFace("", 7, 7);
//        System.out.println(diceFaceRet("", 7, 7));
    }

    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    static ArrayList<String> diceRet(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(diceRet(p + i, target - i));
        }
        return ans;
    }

    static void diceFace(String p, int target, int face){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p + i, target - i, face);
        }
    }

    static ArrayList<String> diceFaceRet(String p, int target, int Face){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= Face && i <= target; i++) {
            ans.addAll(diceFaceRet(p + i, target - i, Face));
        }
        return ans;
    }
}

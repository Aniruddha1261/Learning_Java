public class ReachANumber {
    // https://leetcode.com/problems/reach-a-number/

    // Q:You are standing at position 0 on an infinite number line. There is a destination at position target.
    //You can make some number of moves numMoves so that:
    //On each move, you can either go left or right.
    //During the ith move (starting from i == 1 to i == numMoves), you take (i) steps in the chosen direction.
    //Given the integer target, return the minimum number of moves required (i.e., the minimum numMoves) to reach the destination.
    public static void main(String[] args) {
        int target = 4;
        System.out.println(reachNumber(target));
    }



    // Not Completed
    public static int reachNumber(int target) {
        int steps = 0;
        int num = 0;
        int i = 1;
        while(true){
            if (num == target){
                return steps;
            } else if (Math.abs(target - num) >= i){
                if (target - num < 0) {
                    num = num - i;
                } else {
                    num = num + i;
                }
            } else {
                if (target - num < 0){
                    num = num + i;
                }else {
                    num = num - i;
                }
            }
            i++;
            steps++;
        }
    }
}

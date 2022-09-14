public class GuessNumberHigherOrLower {
    // https://leetcode.com/problems/guess-number-higher-or-lower/

    // Q: We are playing the Guess Game. The game is as follows:
    //I pick a number from 1 to n. You have to guess which number I picked.
    //Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
    //You call a pre-defined API int guess(int num), which returns three possible results:
    //-1: Your guess is higher than the number I picked (i.e. num > pick).
    //1: Your guess is lower than the number I picked (i.e. num < pick).
    //0: your guess is equal to the number I picked (i.e. num == pick).
    //Return the number that I picked.

    public static void main(String[] args) {
        int input = 10;
        int pick = 6;
        System.out.println(guessNumber(input));
    }

    public static int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end ){
            int num = start + (end - start)/ 2;
            if (guess(num) == 0){
                return num;
            } else if (guess(num) == -1) {
                end = num - 1;
            } else {
                start = num + 1;
            }
        }
        return start;
    }

    public static int guess(int num){
        int pick = 6;
        if (num == pick){
            return 0;
        } else if (num > pick) {
            return -1;
        } else {
            return 1;
        }
    }
}

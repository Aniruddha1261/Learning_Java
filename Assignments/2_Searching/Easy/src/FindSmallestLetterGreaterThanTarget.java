public class FindSmallestLetterGreaterThanTarget {
    // https://leetcode.com/problems/find-smallest-letter-greater-than-target/

    // Q: Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.
    //Note that the letters wrap around.
    //For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
    public static void main(String[] args) {
        char[] letters = { 'c','f','j'};
        char target = 'g';
        System.out.println(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (mid >= letters.length){
                return letters[0];
            }
            if (letters[mid] == target && mid < letters.length - 1){
                if (letters[mid + 1] != letters[mid]){
                    return letters[mid + 1];
                } else {
                    start = mid + 1;
                }
            } else if (letters[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (end < 0 || start > letters.length - 1){
                return letters[0];
            }
        }
        return letters[start];
    }

}

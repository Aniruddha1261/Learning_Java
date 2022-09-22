public class Print1ToNWithoutLoop {
    // https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1/

    // Q: Print numbers from 1 to N without the help of loops.
    public static void main(String[] args) {
        int N = 10;
        printNos(N);
    }

    public static void printNos(int N)
    {
        if (N == 1){
            System.out.print(N + " ");
        } else {
            printNos(N - 1);
            System.out.print(N + " ");
        }
    }
}

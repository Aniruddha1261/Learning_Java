public class Concept {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
//        fun(n--);
        fun(--n);

//        n-- vs --n
        // n-- it will pass the value of n first and then subtract 1 from it
        // --n subtract value of n by 1 and then pass the value
    }
}

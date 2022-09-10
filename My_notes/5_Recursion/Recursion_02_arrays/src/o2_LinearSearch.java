import java.lang.reflect.Array;
import java.util.ArrayList;

public class o2_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5, 6, 7, 8, 9, 7};
        System.out.println(linearSearch(arr, 7, 0));
        System.out.println(linearSearch2(arr, 7, 0));
        findAllIndex(arr, 7, 0);
        System.out.println(findAllIndex2(arr, 7, 0, new ArrayList<>()));
        System.out.println(findAllIndex3(arr, 7, 0));
    }

    static boolean linearSearch(int[] arr, int target, int index){

        if (index == arr.length){
            return false;
        }
        return arr[index] == target ||  linearSearch(arr, target, index+1);

    }

    static int linearSearch2(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }

        if (arr[index] == target){
            return index;
        }
        else {
            return linearSearch2(arr, target, index + 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr,int target, int index){
        if (index == arr.length){
            return ;
        }

        if (arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);

    }

    static ArrayList<Integer> findAllIndex2(int[] arr,int target, int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }

        if (arr[index] == target){
            list.add(index);
        }
        return findAllIndex2(arr, target, index + 1, list);

    }


    // VVI
    // Goal is to return the list, but don't take it as argument
    //create the list in the body of the function itself
    // for every function call it will create a new list :(

    //Challenges:
    //return type will be array list
    // problem is that every call will have a new list, we need to pass the data above

    static ArrayList<Integer> findAllIndex3(int[] arr,int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex3(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);
        return list;

    }
}

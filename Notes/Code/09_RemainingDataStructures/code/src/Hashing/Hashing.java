package Hashing;
import java.util.*;
import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        // HashSets :
        // creating
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        // Print all elements
        System.out.println(set);
        // Size
        System.out.println("size of set is: " + set.size());
        // Search - contains
        if (set.contains(1)){
            System.out.println("Set Contains 1");
        }
        if (!set.contains(6)){
            System.out.println("does not contain");
        }
        //Delete
        set.remove(1);
        if (!set.contains(1)){
            System.out.println("does not contain 1 - we deleted");
        }
        // Iterators
        Iterator it = set.iterator();
        //hasNext, next -> functions
        //hasNext returns -> true, false
        //next returns -> value of next element
        while (it.hasNext()){
            System.out.println(it.next());
        }


        // HashMap -> these are unordered maps
        //country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("US", 120);
        map.put("China", 120);

        System.out.println(map);
        map.put("China", 180);  // Updates the value of the pair corresponding to the key
        System.out.println(map);

        //Search -> for key
        if (map.containsKey("China")){
            System.out.println("key is present in the map");
        } else {
            System.out.println("key is not present in the map");
        }

        System.out.println(map.get("China")); // Gives value of the key
        System.out.println(map.get("Indonesia")); // returns null value as no key exists

        // Iteration
        for (Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());   // Prints keys
            System.out.println(e.getValue()); // Prints values
            System.out.println(e + " ");      // Prints values
        }

        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key + " -> " + map.get(key));
        }

        // Removal
        map.remove("China");
        System.out.println(map);
    }
}

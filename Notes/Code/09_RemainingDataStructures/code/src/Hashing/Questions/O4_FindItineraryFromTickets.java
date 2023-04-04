package Hashing.Questions;
import java.util.HashMap;
// Microsoft, OLA
public class O4_FindItineraryFromTickets {
    // Path
    // eg :
    //    "Chennai" -> "Bengaluru"
    //    "Mumbai"  -> "Delhi"
    //    "Goa"     -> "Chennai"
    //    "Delhi"   -> "Goa"
    //  Path:
    // "Mumbai" -> "Delhi" -> "Goa" -> "Chennai" -> "Bengaluru"


    // Key -> from
    // Value -> to
    public static void main(String[] args) {
        HashMap<String , String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        itinerary(map);
    }

    // reverseMap
    // Find starting point
    // print itinerary
    public static void itinerary(HashMap<String , String> ticket){
        String start = getStart(ticket);
        while (ticket.containsKey(start)){
            System.out.print(start + " -> ");
            start = ticket.get(start);
        }
        System.out.println(start + " -> END");
    }
    public static String getStart(HashMap<String , String> ticket){
        HashMap<String , String> revMap = new HashMap<>();
        for (String key : ticket.keySet()){
            // key -> key ; val -> ticket.get(key)
            revMap.put(ticket.get(key), key);
        }
        for (String key : ticket.keySet()){
            if (!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

}

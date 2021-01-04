package map;


import java.util.HashMap;
import java.util.Map;

public class ItineraryFromTickets {

    /**
     * Create a reverse map by iterating over the input map,
     * Make the key as value and value as key
     *
     * Iterate Over the input map, take the source of current ticket
     * and check if it contains in reverse Map.
     *  If contains  -> Don't consider this source as starting point of journey
     *  If not -> We got the starting point
     * @param tickets
     */
    public static void printJourney(HashMap<String, String> tickets) {

        HashMap<String, String> reverseMap = new HashMap<>();

        for(String source : tickets.keySet()) {
            String destination = tickets.get(source);
            reverseMap.put(destination, source);
        }

        String startingPoint = null;
        for(String source : tickets.keySet()) {
            if(!reverseMap.containsKey(source)) {
                startingPoint = source;
            }
        }

        if(startingPoint == null) {
            System.out.println("Not Valid Tickets");
            return;
        }

        System.out.print(startingPoint + "- >");


        while(tickets.get(startingPoint) != null) {
            System.out.print(tickets.get(startingPoint) + "- >");
            startingPoint = tickets.get(startingPoint);
        }


    }


    public static void main(String[] args) {

        HashMap<String, String> ticketMap = new HashMap<>();
        ticketMap.put("Mumbai", "Goa");
        ticketMap.put("Goa", "Hyderabad");
        ticketMap.put("Delhi", "Mumbai");
        ticketMap.put("Hyderabad", "Banglore");

        printJourney(ticketMap);
    }
}

import java.util.ArrayList;
import java.util.HashMap;

public class Airport {
    private ArrayList<Plane> planes;
    private HashMap<String, Flight> flights;
    
    public Airport() {
        planes = new ArrayList<Plane>();
        flights = new HashMap<String, Flight>();
    }
    
    public void addPlane(String planeID, int capacity) {
        planes.add(new Plane(planeID, capacity));
    }
    
    public void addFlight(String planeID, Flight flight) {
        flights.put(planeID, flight);
    }
}

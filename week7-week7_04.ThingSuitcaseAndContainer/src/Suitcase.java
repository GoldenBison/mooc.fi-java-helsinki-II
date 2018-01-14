import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things;
    private int currWeight;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.things = new ArrayList<Thing>();
        this.currWeight = 0;
        this.maxWeight = maxWeight;
    }
    
    public void addThing(Thing thing) {
        if (currWeight + thing.getWeight() < maxWeight) {
            things.add(thing);
            currWeight += thing.getWeight();
        }
    }
    
    @Override
    public String toString() {
        return things.size() + " things (" + currWeight + " kg)";
    }
}

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
        int numOfThings = things.size();
        String finalString = "";
        
        switch (numOfThings) {
            case 0:
                finalString += "empty ";
                break;
            case 1:
                finalString += "1 thing ";
                break;
            default:
                finalString += numOfThings + " things ";
                break;
        }        
        finalString += "(" + currWeight + " kg)";
        
        return finalString;
    }
}

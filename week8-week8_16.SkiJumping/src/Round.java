import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Round {

    private Random random;
    private List<Integer> votes;
    private int length;
    
    public Round() {
        random = new Random();
        votes = new ArrayList<Integer>();
        // Random int between 60 - 120
        length = random.nextInt(61) + 1;
    }
    
    public int getLength() {
        return length;
    }
    
    public void generateVotes(int nVotes) {
        for (int i = 0; i < nVotes; i++) {
            votes.add(random.nextInt(11) + 10);
        }
    }
    
    public void sortVotes() {
        Collections.sort(votes);
    }
    
    public int calculateScore() {
        int total = 0;
        
        for (int i = 1; i < votes.size() - 1; i++) {
            total += votes.get(i);
        }
        
        return total + length;
    }
}

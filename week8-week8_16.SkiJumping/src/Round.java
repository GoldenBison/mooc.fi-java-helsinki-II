import java.util.Arrays;
import java.util.Random;

public class Round {

    private Random random;
    private int[] votes;
    private int length;
    
    public Round() {
        random = new Random();
        votes = new int[5];
        // Random int between 60 - 120
        length = random.nextInt(61) + 1;
    }
    
    public int getLength() {
        return length;
    }
    
    public void generateVotes() {
        for (int i = 0; i < votes.length; i++) {
            votes[i] = random.nextInt(11) + 10;
        }
    }
    
    public void sortVotes() {
        Arrays.sort(votes);
    }
    
    public int calculateScore() {
        int total = 0;
        
        for (int i = 1; i < votes.length - 1; i++) {
            total += votes[i];
        }
        
        return total + length;
    }
}

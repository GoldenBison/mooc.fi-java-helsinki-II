import java.util.Random;

public class Round {

    private Random random;
    private int[] votes;
    
    public Round() {
        random = new Random();
        votes = new int[5];
    }
    
    public int getLength() {
        // Random int between 60 - 120
        return random.nextInt(61) + 1;
    }
    
    public void generateVotes() {
        for (int i = 0; i < votes.length; i++) {
            votes[i] = random.nextInt(11) + 10;
        }
    }
}

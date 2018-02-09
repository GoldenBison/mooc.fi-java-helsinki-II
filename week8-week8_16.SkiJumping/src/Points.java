import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Points {

    private Random random;
    
    public Points() {
        random = new Random();
    }
    
    public int generateLength() {
        // Random int between 60 - 120
        return random.nextInt(61) + 1;
    }
    
    public List<Integer> generateVotes(int nVotes) {
        List<Integer> votes = new ArrayList<Integer>();
        
        for (int i = 0; i < nVotes; i++) {
            votes.add(random.nextInt(11) + 10);
        }
        
        return votes;
    }
}


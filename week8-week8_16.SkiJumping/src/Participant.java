import java.util.ArrayList;
import java.util.List;

public class Participant {
    
    private String name;
    private List<Integer> scores;
    
    public Participant(String name) {
        this.name = name;
        this.scores = new ArrayList<Integer>();
    }
    
    public void addScore(int score) {
        scores.add(score);
    }
    
    public int totalScore() {
        int total = 0;
        
        for (int score : scores) {
            total += score;
        }
        
        return total;
    }
}

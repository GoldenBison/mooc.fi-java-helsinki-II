import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tournament {

    private List<Participant> participants;
    private int round;
    
    public Tournament() {
        participants = new ArrayList<Participant>();
        round = 1;
    }
    
    public void addParticipant(String name) {
        participants.add(new Participant(name));
    }
    
    public void nextRound() {
        round++;
    }
    
    public int getRound() {
        return round;
    }
    
    public void sortParticipants() {
        Collections.sort(participants);
    }
}

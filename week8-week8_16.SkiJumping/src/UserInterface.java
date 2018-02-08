import java.util.Scanner;

public class UserInterface {

    private Scanner reader;
    
    public UserInterface() {
        reader = new Scanner(System.in);
    }
    
    public void start() {
        System.out.println("Kumpula ski jumping week");
    }
    
    public void getParticipantNames() {
        System.out.println("Write the names of the participants one at a time; "
                + "an empty string brings you to the jumping phase.");
        
        while (true) {
            System.out.print("Participant name: ");
            String name = reader.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
        }
    }
}

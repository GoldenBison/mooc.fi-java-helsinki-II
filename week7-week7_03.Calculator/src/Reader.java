import java.util.Scanner;

public class Reader {
    private Scanner scanner;
    
    public Reader() {
        scanner = new Scanner(System.in);
    }
    
    public String readString() {
        return scanner.nextLine();
    }
    
    public int readInt() {
        return Integer.parseInt(scanner.nextLine());
    }
}

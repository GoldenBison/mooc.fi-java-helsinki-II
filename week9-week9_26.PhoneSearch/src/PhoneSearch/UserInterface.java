package PhoneSearch;

import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    
    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }
    
    public void start() {
        printMenu();
    }
    
    public void printMenu() {
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
    }
}

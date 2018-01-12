
public class Smileys {
    private static void printWithSmileys(String characterString) {
        int length = characterString.length();
        
        printSmiley(length / 2 + 3);
        if (length % 2 == 0) {
            System.out.println(":) " + characterString + " :)");
        } else {
            System.out.println(":) " + characterString + "  :)");
        }
        printSmiley(length / 2 + 3);
    }
    
    private static void printSmiley(int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(":)");
        }
        
        System.out.println();
    }

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }
}

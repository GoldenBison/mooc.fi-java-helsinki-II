
public class Smileys {
    private static void printWithSmileys(String characterString) {
        int length = characterString.length();
        
        printStringNTimes(":)", length);
        if (length % 2 == 0) {
            System.out.println(":) " + characterString + " :)");
        } else {
            System.out.println(":) " + characterString + "  :)");
        }
        printStringNTimes(":)", length);
    }
    
    private static void printStringNTimes(String string, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(string);
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

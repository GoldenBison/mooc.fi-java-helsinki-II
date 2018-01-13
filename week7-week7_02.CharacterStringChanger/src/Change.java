public class Change {
    private char fromChar;
    private char toChar;
    
    public Change(char fromCharacter, char toCharacter) {
        this.fromChar = fromCharacter;
        this.toChar = toCharacter;
    }
    
    public String change(String characterString) {
        return characterString.replace(fromChar, toChar);
    }
    
    // Custom "change" method
    /*
        public String change(String characterString) {
            String newString = "";

            for (int i = 0; i < characterString.length(); i++) {
                char currChar = characterString.charAt(i);
                if (currChar == fromChar) {
                    newString += toChar;
                } else {
                    newString += currChar;
                }
            }

            return newString;
        }
    */
}

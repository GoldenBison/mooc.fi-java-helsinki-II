package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordInspection {
    
    private File file;

    public WordInspection(File file) {
        this.file = file;
    }

    public int wordCount() throws FileNotFoundException {
        Scanner reader = new Scanner(file, "UTF-8");
        int nWords = 0;
        
        while (reader.hasNext()) {
            reader.next();
            nWords++;
        }
        
        return nWords;
    }
}

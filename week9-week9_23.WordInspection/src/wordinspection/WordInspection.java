package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
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
    
    public List<String> wordsContainingZ() throws FileNotFoundException {
        List<String> zWords = new ArrayList<String>();
        Scanner reader = new Scanner(file, "UTF-8");
        
        while (reader.hasNext()) {
            String word = reader.next();
            
            if (word.contains("z")) {
                zWords.add(word);
            }
        }
        
        return zWords;
    }
    
    public List<String> wordsEndingInL() throws FileNotFoundException {
        List<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(file, "UTF-8");
        
        while (reader.hasNext()) {
            String word = reader.next();
            
            if (word.endsWith("l")) {
                words.add(word);
            }
        }
        
        return words;
    }
}

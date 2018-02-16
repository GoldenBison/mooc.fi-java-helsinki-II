package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    
    private Set<String> uniqueWords;
    private int nDuplicates;

    public PersonalDuplicateRemover() {
        this.uniqueWords = new HashSet<String>();
        this.nDuplicates = 0;
    }

    @Override
    public void add(String characterString) {
        if (uniqueWords.contains(characterString)) {
            nDuplicates++;
        } else {
            uniqueWords.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return nDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return uniqueWords;
    }

    @Override
    public void empty() {
        uniqueWords.clear();
        nDuplicates = 0;
    }
}

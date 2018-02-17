package PhoneSearch;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    private Map<String, Set<String>> numberByName;
    private Map<String, String> nameByNumber;
    private Map<String, Address> addressByName;
    
    public void addNumber(String name, String number) {
        if (!numberByName.containsKey(name)) {
            numberByName.put(name, new HashSet<String>());
        }
        numberByName.get(name).add(number);
    }
    
    public void searchNumber(String name) {
        if (numberByName.containsKey(name)) {
            for (String number : numberByName.get(name)) {
                System.out.println(" " + number);
            }
        } else {
            System.out.println("  not found");
        }
    }

    public void searchPersonByNumber(String number) {
        
    }

    public void addAddress(String name, String street, String city) {
        
    }

    public void searchPersonalInfo(String name) {
        
    }

    public void deletePersonalInfo(String name) {
        
    }

    public void filteredListing(String keyword) {
        
    }
}

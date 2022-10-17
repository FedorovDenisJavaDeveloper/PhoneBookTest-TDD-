import java.util.HashMap;
import java.util.TreeMap;

public class PhoneBook {
    TreeMap<String, String> phoneBook = new TreeMap<>();
    HashMap<String, String> reversedKeyBook = new HashMap<>();

    public int add(String name, String phone) {
        if (name == null || phone == null) {
            throw new NullPointerException();
        }
        if (phoneBook.putIfAbsent(name, phone) == null) {
            reversedKeyBook.put(phone, name);
        }
        return phoneBook.size();
    }

    public String findByNumber(String phone) {
        if (!reversedKeyBook.containsKey(phone)) {
            return null;
        }
        return reversedKeyBook.get(phone);
    }
}

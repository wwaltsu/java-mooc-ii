
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Program {

    public static void printKeys(HashMap<String, String> hashmap) {
        System.out.println(hashmap.keySet());

    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        ArrayList<String> partOfKeys = new ArrayList<>();

        for (String keys : hashmap.keySet()) {
            if (!keys.contains(text)) {
                continue;
            }

            // if the key contains the given string
            // we retrieve the value related to it
            // and add it tot the set of books to be returned
            partOfKeys.add(hashmap.get(keys));
            System.out.println(keys);
        }

    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        ArrayList<String> partOfKeys = new ArrayList<>();

        for (String key : hashmap.keySet()) {
            if (!key.contains(text)) {
                continue;
            }
            partOfKeys.add(hashmap.get(key));

        }
        System.out.println(partOfKeys);

    }

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");

    }

}

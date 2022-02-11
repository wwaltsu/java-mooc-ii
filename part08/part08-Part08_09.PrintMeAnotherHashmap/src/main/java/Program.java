
import java.util.HashMap;

public class Program {

    public static void printValues(HashMap<String, Book> hashmap) {
        System.out.println(hashmap.values());
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String Text) {
        for (Book book : hashmap.values()) {
            if (book.getName().contains(Text)) {
                System.out.println(book);
            }

        }
        // System.out.println(books);

    }

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");

    }

}

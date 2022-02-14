import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> hashmap;

    public IOU() {
        this.hashmap = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {

        hashmap.put(toWhom, amount);

    }

    public double howMuchDoIOweTo(String toWhom) {
        if (hashmap.get(toWhom) == null) {
            return 0;
        }
        return hashmap.get(toWhom);
    }

}

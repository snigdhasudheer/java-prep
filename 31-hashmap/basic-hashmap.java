import java.util.HashMap;

public class BasicHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // insert
        map.put(101, "Chinnu");
        map.put(102, "Rahul");
        map.put(103, "Aman");

        // display
        System.out.println(map);

        // get value
        System.out.println(map.get(102));

        // check key
        System.out.println(map.containsKey(101));

        // remove
        map.remove(103);

        System.out.println(map);
    }
}

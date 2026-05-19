

import java.util.HashMap;

public class NonRepeating {
    public static void main(String[] args) {

        String str = "programming";

        HashMap<Character, Integer> map = new HashMap<>();

        // count frequency
        for (char ch : str.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // find first non-repeating
        for (char ch : str.toCharArray()) {

            if (map.get(ch) == 1) {
                System.out.println("First Non-Repeating: " + ch);
                break;
            }
        }
    }
}

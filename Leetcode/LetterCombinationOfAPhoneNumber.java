import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfAPhoneNumber {
    public static void main(String[] args) {
        String digits = "23";
        List<String> result = combination("", digits);
        System.out.println(result);
    }

    static List<String> combination(String p, String up) {
        if (up.isEmpty()) {
            List<String> l = new ArrayList<>();
            if (!p.isEmpty()) {
                l.add(p);
            }
            return l;
        }

        int digit = up.charAt(0) - '0'; // character → integer conversion trick
        String[] map = {
                "", // 0
                "", // 1
                "abc", // 2
                "def", // 3
                "ghi", // 4
                "jkl", // 5
                "mno", // 6
                "pqrs", // 7
                "tuv", // 8
                "wxyz" // 9
        };

        String letters = map[digit]; // Get all possible letters for this digit from keypad mapping
        List<String> result = new ArrayList<>();
        for (int i = 0; i < letters.length(); i++) {
            result.addAll(combination(p + letters.charAt(i), up.substring(1)));
        }
        return result;
    }
}

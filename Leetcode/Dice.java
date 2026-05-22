// Not Leetcode
// Amazon

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        List<String> result = diceRoll("", 4);
        System.out.println(result);
    }

    static List<String> diceRoll(String p, int target) {
        if (target == 0) {
            List<String> l = new ArrayList<>();
            l.add(p); // store the sequence
            return l;
        }

        List<String> result = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            result.addAll(diceRoll(p + i, target - i)); // append the current dice face to the sequence and reduce the target by that face value
        }
        return result;
    }
}
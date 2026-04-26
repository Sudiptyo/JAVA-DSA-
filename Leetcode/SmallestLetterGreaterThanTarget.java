// 744. Find Smallest Letter Greater Than Target

import java.util.Scanner;

class Searches {

    public char nextGreatestLetter(char[] letters, char k) {

        int low = 0, high = letters.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (k < letters[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }

        return letters[low % letters.length]; // if low == letters.length, it means target is greater than the greatest letter in array, so we return the first letter in array
    }
}

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };

            System.out.print("Enter an element to search: ");
            char k = sc.next().charAt(0);

            Searches s = new Searches();

            char result = s.nextGreatestLetter(letters, k);

            System.out.printf("Smallest letter greater than %c is %c", k, result);
        }
    }
}

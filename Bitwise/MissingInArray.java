
public class MissingInArray {
    public static void main(String[] args) {
        int[] a = { 0, 1, 3, 4 };
        System.out.printf("Missing: %d", Missing(a));
    }

    private static int Missing(int[] a) {
        int missing = a.length;

        for (int i = 0; i <= missing; i++) {
            missing ^= i ^ a[i]; // XOR operation will cancel out duplicate numbers and leave the missing number
        }

        return missing;
    }
}
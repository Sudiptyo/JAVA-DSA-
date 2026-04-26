public class UniqueInArray {
    public static void main(String[] args) {
        int[] a = { 2, 2, 4, 4, 5, 5, 6, 7, 7 };
        System.out.printf("Unique: %d", Unique(a));
    }

    private static int Unique(int[] a) {
        int unique = 0;

        for (int n : a) {
            unique ^= n; // XOR operation will cancel out duplicate numbers and leave the unique number
        }
        return unique;
    }
}

// 1295. Find Numbers with Even Number of Digits

public class EvenDigitsCount {
    public static void main(String[] args) {
        // int[] a = { 456, 953, 984, 56, 8945, 36, 984 };

        for (int i : a) {
            int count = 0;
            int j = Math.abs(i);

            if (j == 0) {
                count = 1;
            } else {
                while (j != 0) {
                    j /= 10;
                    count++;
                }
            }
            if (count % 2 == 0) {
               return count;
            }
        }
        return -1;
    }
}
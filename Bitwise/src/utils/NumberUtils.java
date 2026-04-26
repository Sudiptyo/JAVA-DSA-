package utils;

public final class NumberUtils {

    // Private constructor → prevents object creation
    private NumberUtils() {
    }

    /**
     * Counts digits of a number in a given base.
     * Works for all integers (positive, negative, zero).
     */
    public static int countDigits(int number, int base) {

        if (base <= 1) {
            throw new IllegalArgumentException("Base must be greater than 1");
        }

        if (number == 0)
            return 1;

        number = Math.abs(number); // handle negative numbers

        int count = 0;
        while (number > 0) {
            number /= base;
            count++;
        }

        return count;
    }

    /**
     * Fast logarithmic version (optional)
     */
    public static int countDigitsLog(int number, int base) {

        if (base <= 1) {
            throw new IllegalArgumentException("Base must be greater than 1");
        }

        if (number == 0)
            return 1;

        number = Math.abs(number);

        return (int) (Math.log(number) / Math.log(base)) + 1;
    }
}
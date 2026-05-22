// Radix Sort sorts numbers digit by digit using Count Sort.

class Sort {

    public void Display(int[] a) {
        System.out.print("Sorted Array: ");

        for (int val : a) {
            System.out.printf("%d ", val);
        }
    }

    public int getMax(int[] a) {
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        return max;
    }

    public void countSort(int[] a, int pos) {

        int n = a.length;

        int[] output = new int[n];
        int[] count = new int[10];

        // Store count of digits
        for (int i = 0; i < n; i++) {

            int digit = (a[i] / pos) % 10;
            count[digit]++;
        }

        // Prefix Sum
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build Output Array
        for (int i = n - 1; i >= 0; i--) {

            int digit = (a[i] / pos) % 10;

            output[count[digit] - 1] = a[i];

            count[digit]--;
        }

        // Copy back to original array
        System.arraycopy(output, 0, a, 0, n);
    }

    public void radixSort(int[] a) {

        int max = getMax(a);

        // Apply count sort for every digit
        for (int pos = 1; max / pos > 0; pos *= 10) {

            countSort(a, pos);
        }
    }
}

public class RadixSort {

    public static void main(String[] args) {

        int[] a = { 5, 4, 3, 2, 1 };

        Sort s = new Sort();

        s.radixSort(a);

        s.Display(a);
    }
}
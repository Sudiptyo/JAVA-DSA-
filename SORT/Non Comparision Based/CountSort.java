
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

    public void countSort(int[] a) {
        int max = getMax(a);
        int[] count = new int[max + 1];
        int i, j = 0;

        // Count frequency of each element in the array
        for (i = 0; i < a.length; i++) {
            count[a[i]]++;
        }

        // Reconstruct the Sorted array using Count array
        for (i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                a[j++] = i;
                count[i]--;
            }
        }

    }
}

public class CountSort {
    public static void main(String[] args) {

        int[] a = { 5, 4, 3, 2, 1 };

        Sort s = new Sort();
        s.countSort(a);
        s.Display(a);

    }
}

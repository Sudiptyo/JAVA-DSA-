
class Sort {

    public void Display(int[] a) {
        System.out.print("Sorted Array: ");

        for (int val : a) {
            System.out.printf("%d ", val);
        }
    }

    public int Partition(int[] a, int low, int high) {

        int pivot = a[low];
        int i = low + 1;
        int j = high;
        int t;

        do {

            while (i <= high && a[i] <= pivot) {
                i++;
            }

            while (j >= low && a[j] > pivot) {
                j--;
            }

            if (i < j) {
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        } while (i < j);

        t = a[low];
        a[low] = a[j];
        a[j] = t;

        return j;
    }

    public void QuickSort(int[] a, int low, int high) {
        if (low < high) {
            int partitionIdx = Partition(a, low, high);
            QuickSort(a, low, partitionIdx - 1);
            QuickSort(a, partitionIdx + 1, high);
        }
    }
}

public class QuickSort {
    public static void main(String[] args) {

        int[] a = { 5, 4, 3, 2, 1 };

        Sort s = new Sort();
        s.QuickSort(a, 0, a.length - 1);
        s.Display(a);
    }
}

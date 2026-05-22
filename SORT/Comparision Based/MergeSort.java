
class Sort {

    public void Display(int[] a) {
        System.out.print("Sorted Array: ");

        for (int val : a) {
            System.out.printf("%d ", val);
        }
    }

    public void Merge(int[] a, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int[] b = new int[high - low + 1];
        int k = 0;

        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                b[k++] = a[i++];
            } else {
                b[k++] = a[j++];
            }
        }

        while (i <= mid)
            b[k++] = a[i++];

        while (j <= high)
            b[k++] = a[j++];

        for (i = low, j = 0; i <= high; i++, j++) {
            a[i] = b[j];
        }
    }

    public void mergeSort(int[] a, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            Merge(a, low, mid, high);
        }
    }
}

public class MergeSort {
    public static void main(String[] args) {

        int[] a = { 5, 4, 3, 2, 1 };

        Sort s = new Sort();
        s.mergeSort(a, 0, a.length - 1);
        s.Display(a);
    }
}

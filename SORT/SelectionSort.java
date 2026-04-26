
class Search {

    public void Display(int[] a) {
        System.out.print("Sorted Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
    }

    public void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min_idx] > a[j]) {
                    min_idx = j;
                }
            }
            if (min_idx != i) {
                int k = a[min_idx];
                a[min_idx] = a[i];
                a[i] = k;
            }
        }
    }
}

public class SelectionSort {
    public static void main(String[] args) {

        int[] a = { 5, 4, 3, 2, 1 };

        Search s = new Search();
        s.selectionSort(a);
        s.Display(a);

    }
}

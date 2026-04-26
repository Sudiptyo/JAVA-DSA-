
class Search {

    public void Display(int[] a) {
        System.out.print("Sorted Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
    }

    public void insertionSort(int[] a) {

        int j, key;

        for (int i = 0; i < a.length; i++) {
            key = a[i];
            j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }
}

public class InsertionSort {
    public static void main(String[] args) {

        int[] a = { 5, 4, 3, 2, 1 };

        Search s = new Search();
        s.insertionSort(a);
        s.Display(a);

    }
}

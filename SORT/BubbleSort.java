
class Search {

    public void Display(int[] a) {
        System.out.print("Sorted Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
    }

    public void bubbleSort(int[] a) {
        boolean isSwapped;

        for (int i = 0; i < a.length - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int k = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = k;
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break;
        }
    }
}

public class BubbleSort {
    public static void main(String[] args) {
        
        int[] a = { 5, 4, 3, 2, 1 };

        Search s = new Search();
        s.bubbleSort(a);
        s.Display(a);

    }

}

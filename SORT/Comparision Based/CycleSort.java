
class Sort {

    public void Display(int[] a) {
        System.out.print("Sorted Array: ");

        for (int val : a) {
            System.out.printf("%d ", val);
        }
    }

    public void Swap(int[] a, int x, int y) {

        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }

    public void cycleSort(int[] a) {
        int i = 0;
        while (i < a.length) {
            int correct = a[i] - 1;
            if (a[i] != a[correct]) {
                Swap(a, i, correct);
            } else {
                i++;
            }
        }
    }
}

public class CycleSort {

    public static void main(String[] args) {

        int[] a = { 5, 4, 3, 2, 1 };

        Sort s = new Sort();
        s.cycleSort(a);
        s.Display(a);
    }

}

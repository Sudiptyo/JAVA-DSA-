
// Original Array
//        ↓
// Create Buckets
//        ↓
// Distribute Elements
//        ↓
// Sort Individual Buckets
//        ↓
// Merge Buckets
//        ↓
// Sorted Array

import java.util.ArrayList;
import java.util.Collections;

class Sort {

    public void Display(float[] a) {
        System.out.print("Sorted Array: ");

        for (float val : a) {
            System.out.printf("%.2f ", val);
        }
    }

    public void bucketSort(float[] a) {
        int n = a.length;

        // Create Buckets
        @SuppressWarnings("unchecked")
        ArrayList<Float>[] buckets = (ArrayList<Float>[]) new ArrayList[n];

        // Initialize each bucket
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>(); // Now each bucket becomes an empty ArrayList.
        }

        // Put elements into buckets
        // a[0] = 0.42
        // 0.42 × 5 = 2.1
        // (int)2.1 = 2
        // Bucket 2 → [0.42]
        // 0 → [ ]
        // 1 → [ ]
        // 2 → [0.42]
        // 3 → [ ]
        // 4 → [ ]
        for (int i = 0; i < n; i++) {
            int bucketIdx = (int) (a[i] * n);
            buckets[bucketIdx].add(a[i]);
        }

        // Sort each bucket
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // Merge buckets into original array
        int idx = 0;

        for (int i = 0; i < n; i++) {
            for (float val : buckets[i]) {
                a[idx++] = val;
            }
        }
    }
}

public class BucketSort {
    public static void main(String[] args) {

        float[] a = { 0.42f, 0.32f, 0.23f, 0.52f, 0.25f };
        // float[] a = { 0.25f, 0.23f, 0.24f, 0.29f };

        Sort s = new Sort();

        s.bucketSort(a);

        s.Display(a);
    }
}
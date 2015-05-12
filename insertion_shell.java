package insertion_shell_sorting;

import java.util.Random;

public class Insertion_shell_sorting {

    public static void InsertionSort(int[] num) {
        int j;                     // the number of items sorted so far
        int key;                // the item to be inserted
        int i;

        for (j = 1; j < num.length; j++) // Start with 1 (not 0)
        {
            key = num[j];
            for (i = j - 1; (i >= 0) && (num[i] < key); i--) // Smaller values are moving up
            {
                num[i + 1] = num[i];
            }
            num[i + 1] = key;    // Put the key in its proper location
        }
    }

    public static void shellsort(Comparable[] a) {
        for (int gap = a.length / 2; gap > 0;
                gap = gap == 2 ? 1 : (int) (gap / 2.2)) {
            for (int i = gap; i < a.length; i++) {
                Comparable tmp = a[i];
                int j = i;

                for (; j >= gap && tmp.compareTo(a[j - gap]) < 0; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j] = tmp;
            }
        }
    }

    static void print(int dizi[]) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + ",");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] dizi = new int[20];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(20);
        }
        print(dizi);
        shellsort(dizi);
        print(dizi);
        InsertionSort(dizi);
        print(dizi);

    }

}

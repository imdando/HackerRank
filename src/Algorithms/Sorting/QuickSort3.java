package Algorithms.Sorting;

import java.util.Scanner;

/**
 * Created by Wayn on 23/05/2015.
 * https://www.hackerrank.com/challenges/quicksort3
 */
public class QuickSort3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        partition(array, 0, n - 1);

    }

    private static void partition(int[] array, int from, int to) {
        if (to - from < 1)
            return;
        int pivot = array[to];
        //index marker for the right array
        int marker = from;
        for (int i = from; i < to; i++) {
            if (array[i] < pivot) {
                swap(array, i, marker);
                marker++;
            }
        }
        swap(array, to, marker);
        //at this point:
        //  left array: from till marker - 1
        //  pivot: marker
        //  right array: marker + 1 till to;
        print(array);
        partition(array, from, marker - 1);
        partition(array, marker + 1, to);
    }

    private static void print(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            sb.append(i).append(' ');
        }
        System.out.println(sb);
    }

    private static void swap(int[] array, int index1, int index2) {
        if (index1 == index2)
            return;
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

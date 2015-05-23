package Algorithms.Sorting;

import java.util.Scanner;

/**
 * Created by Wayn on 23/05/2015.
 * https://www.hackerrank.com/challenges/correctness-invariant
 */
public class CorrectnessInvariant {
    public static void insertionSort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int value = A[i];
            int j = i - 1;
            while (j > 0 && A[j] > value) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            if (j == 0 && A[j] > value) {
                //swap
                A[j + 1] = A[j];
                A[j] = value;
            } else {
                A[j + 1] = value;
            }
        }

        printArray(A);
    }

    private static void printArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            sb.append(i).append(' ');
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        insertionSort(ar);
    }
}

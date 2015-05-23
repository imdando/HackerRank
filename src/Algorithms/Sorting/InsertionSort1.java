package Algorithms.Sorting;

import java.util.Scanner;

/**
 * Created by Wayn on 22/05/2015.
 * https://www.hackerrank.com/challenges/insertionsort1
 */
public class InsertionSort1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] array = new int[s];
        for (int i = 0; i < s; i++) {
            array[i] = in.nextInt();
        }
        s--;
        int insertValue = array[s];
        while (true) {
            if (s == 0) {
                array[s] = insertValue;
                printArray(array);
                break;
            }

            if (array[s - 1] > insertValue) {
                array[s] = array[s - 1];
                s--;
                printArray(array);
            } else {
                array[s] = insertValue;
                printArray(array);
                break;
            }

        }
    }

    private static void printArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            sb.append(i).append(' ');
        }
        System.out.println(sb);
    }
}

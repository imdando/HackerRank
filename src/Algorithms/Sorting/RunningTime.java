package Algorithms.Sorting;

import java.util.Scanner;

/**
 * Created by Wayn on 22/05/2015.
 * https://www.hackerrank.com/challenges/runningtime
 */
public class RunningTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] array = new int[s];
        for (int i = 0; i < s; i++) {
            array[i] = in.nextInt();
        }
        long shifts = 0;
        for (int i = 1; i < s; i++) {
            int currentIndex = i;
            int insertValue = array[i];
            while (true) {
                if (currentIndex == 0) {
                    array[currentIndex] = insertValue;
                    break;
                }

                if (array[currentIndex - 1] > insertValue) {
                    array[currentIndex] = array[currentIndex - 1];
                    shifts++;
                    currentIndex--;
                } else {
                    array[currentIndex] = insertValue;
                    break;
                }

            }
        }
        System.out.println(shifts);
    }

}

package Algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by Wayn on 10/05/2015.
 * https://www.hackerrank.com/challenges/kaprekar-numbers
 */
public class ModifiedKaprekarNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        boolean hasAnswer = false;
        for (int i = p; i <= q; i++) {
            if (isKaprekar(i)) {
                System.out.print(i + " ");
                hasAnswer = true;
            }
        }
        if (!hasAnswer)
            System.out.println("INVALID RANGE");
    }

    /**
     * Tests if a given number is a Kaprekar Number
     */
    private static boolean isKaprekar(int number) {
        long square = (long) number * number;
        int[] list = getArray(square);
        int mid = list.length / 2 + list.length % 2;
        int right = trimInt(list, 0, mid);
        int left = trimInt(list, mid, list.length);
        return right + left == number;

    }

    /**
     * returns an int formed from the provided number array with the digits provided.
     */
    private static int trimInt(int[] numberArray, int from, int to) {
        int returnVal = 0, j = 0;
        for (int i = from; i < to; i++) {
            returnVal += numberArray[i] * Math.pow(10, j);
            j++;
        }
        return returnVal;
    }

    /**
     * Push a given long into an array
     *
     * @return int array with the lowest digit in position 0
     */
    private static int[] getArray(long number) {
        int i = 0;
        int[] returnVal = new int[Long.toString(number).length()];
        while (number > 0) {
            returnVal[i] = (int) (number % 10);
            number /= 10;
            i++;
        }
        return returnVal;
    }
}

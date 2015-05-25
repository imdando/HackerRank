package Algorithms.DynamicProgramming;

import java.util.Scanner;

/**
 * Created by Wayn on 25/05/2015.
 * https://www.hackerrank.com/challenges/maxsubarray
 */
public class MaxSubarray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int size = in.nextInt();
            int[] array = new int[size];
            long nonContiguousSum = 0, contiguousSum = 0;
            long maxContiguousSum = 0;
            int largestNumber = Integer.MIN_VALUE;
            for (int j = 0; j < size; j++) {
                array[j] = in.nextInt();
                //cache the largest value seen
                if (array[j] > largestNumber) {
                    largestNumber = array[j];
                }
                //sum all positives for non-contiguous
                if (array[j] > 0) {
                    nonContiguousSum += array[j];
                }
                //for the contiguous range, if at any point, adding the value
                //gives a negative sum, restart accumulating from j
                long temp = contiguousSum + array[j];
                if (temp <= 0) {
                    contiguousSum = 0;
                } else {
                    contiguousSum = temp;
                }
                if (contiguousSum > maxContiguousSum)
                    maxContiguousSum = contiguousSum;

            }
            //for the edge case for arrays with no positive values
            //both sums will just be the largest number.
            if (largestNumber <= 0) {
                nonContiguousSum = largestNumber;
                maxContiguousSum = largestNumber;
            }


            System.out.println(maxContiguousSum + " " + nonContiguousSum);
        }
    }
}

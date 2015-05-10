package Algorithms.Warmup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/angry-children
 */
class MaxMin {

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int[] list = new int[N];
        //need a sorted list
        ArrayList<Integer> numbers = new ArrayList();
        for (int i = 0; i < N; i++) {
            numbers.add(in.nextInt());
        }
        Collections.sort(numbers);
        int j = 0;
        for (Integer num : numbers) {
            list[j] = num;
            j++;
        }

        int unfairness = Integer.MAX_VALUE;

      /*
       * Write your code here, to process numPackets N, numKids K, and the packets of candies
       * Compute the ideal value for unfairness over here
      */
        for (int i = 0; i < N - K; i++) {
            int diff = list[i + K - 1] - list[i];
            unfairness = diff < unfairness ? diff : unfairness;
        }

        System.out.println(unfairness);
    }
}
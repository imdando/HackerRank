package Algorithms.Warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/maximizing-xor
 */
class MaximizingXOR {

    static int maximizeXOR(int l, int r) {
        int returnVal = 0;
        for (int i = l; i <= r; i++) {
            for (int j = l; j <= r; j++) {
                int xorValue = i ^ j;
                returnVal = xorValue > returnVal ? xorValue : returnVal;
            }
        }
        return returnVal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        System.out.println(maximizeXOR(l, r));
    }
}
package Algorithms.Warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/solve-me-second
 */
class SolveMeSecond {

    static int solveMeSecond(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        int sum;
        int a, b;
        t = in.nextInt();
        for (int i = 0; i < t; i++) {
            a = in.nextInt();
            b = in.nextInt();
            sum = solveMeSecond(a, b);
            System.out.println(sum);
        }
    }
}
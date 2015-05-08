package Algorithms.Warmup;

import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * https://www.hackerrank.com/challenges/manasa-and-stones
 */
class ManasaAndStones {

    static int a, b;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        int n;
        t = in.nextInt();
        for (int i = 0; i < t; i++) {
            n = in.nextInt();
            a = in.nextInt();
            b = in.nextInt();
            SortedSet<Integer> possibleNums = new TreeSet<Integer>();
            for (int j = 0; j < n; j++) {
                int k = n - 1 - j;
                possibleNums.add(k * b + j * a);
            }
            printSet(possibleNums);
        }

    }

    private static void printSet(Set<Integer> possibleNums) {
        for (Integer num : possibleNums) {
            System.out.print(num.toString() + ' ');
        }
        System.out.println();

    }
}
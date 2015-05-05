package Algorithms.Warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/utopian-tree
 */
class UtopianTree {

    static int findHeight(int numCycles) {
        int height = 1;
        for (int i = 1; i <= numCycles; i++) {
            if (i % 2 == 1) {
                height *= 2;
            }
            if (i % 2 == 0) {
                height +=1;
            }
        }
        return height;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        int sum;
        int n;
        t = in.nextInt();
        for (int i=0;i<t;i++) {
            n = in.nextInt();
            sum = findHeight(n);
            System.out.println(sum);
        }
    }
}
package Algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by Wayn on 05/05/2015.
 * https://www.hackerrank.com/challenges/filling-jars
 */
public class FillingJars {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numJars = in.nextInt();
        int numLines = in.nextInt();
        long total = 0;
        for (int i = 0; i < numLines; i++) {
            int fromJar = in.nextInt();
            int toJar = in.nextInt();
            long candiesToAdd = in.nextLong();
            total = countNewtotal(total, fromJar, toJar, candiesToAdd);
        }

        long average = total / numJars;
        System.out.println(average);
    }

    private static long countNewtotal(long total, int fromJar, int toJar, long candiesToAdd) {
        return total + (toJar - fromJar + 1) * candiesToAdd;
    }
}

package Algorithms.Warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/angry-professor
 */
class AngryProfessor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int numToCancel = n - k + 1;
            int numLateStudents = 0;
            for (int j = 0; j < n; j++) {
                if (in.nextInt() > 0)
                    numLateStudents++;
                if (numLateStudents >= numToCancel) {
                    in.nextLine();
                    System.out.println("YES");
                    break;
                }
                if (j == n - 1)
                    System.out.println("NO");
            }
        }
    }
}
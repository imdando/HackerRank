package Algorithms.Sorting;

import java.util.Scanner;

/**
 * Created by Wayn on 22/05/2015.
 * https://www.hackerrank.com/challenges/tutorial-intro
 */
public class TutorialIntro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (in.nextInt() == v) {
                System.out.println(i);
                break;
            }
        }
    }
}

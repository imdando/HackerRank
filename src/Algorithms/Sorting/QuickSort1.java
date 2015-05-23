package Algorithms.Sorting;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Wayn on 23/05/2015.
 * https://www.hackerrank.com/challenges/quicksort1
 */
public class QuickSort1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        List<Integer> left = new LinkedList<Integer>();
        List<Integer> right = new LinkedList<Integer>();
        for (int i = 1; i < n; i++) {
            int next = in.nextInt();
            if (next < p) {
                left.add(next);
            } else {
                right.add(next);
            }
        }
        print(left, p, right);
    }

    private static void print(List<Integer> left, int p, List<Integer> right) {
        StringBuilder sb = new StringBuilder();
        for (Integer i : left) {
            sb.append(i).append(' ');
        }
        sb.append(p).append(' ');
        for (Integer i : right) {
            sb.append(i).append(' ');
        }
        System.out.println(sb);
    }

}

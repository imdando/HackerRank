package Algorithms.Sorting;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Wayn on 23/05/2015.
 * https://www.hackerrank.com/challenges/quicksort2
 */
public class QuickSort2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        partition(list);

    }

    private static LinkedList<Integer> partition(LinkedList<Integer> list) {
        if (list.size() <= 1)
            return list;
        Integer p = list.removeFirst();
        LinkedList<Integer> left = new LinkedList<Integer>();
        LinkedList<Integer> right = new LinkedList<Integer>();
        while (!list.isEmpty()) {
            Integer next = list.removeFirst();
            if (next < p) {
                left.add(next);
            } else {
                right.add(next);
            }
        }
        left = partition(left);
        right = partition(right);
        print(left, p, right);
        left.add(p);
        left.addAll(right);
        return left;
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

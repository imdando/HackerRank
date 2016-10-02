package java_datastructures;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Wayn on 02/10/2016.
 * https://www.hackerrank.com/challenges/java-1d-array
 */
public class OneDArrayP2 {

    public static class Solution {
        static int[] array;
        static int n, m;

        static Set<Integer> indicesSeen;

        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);

            int numTests = scanner.nextInt();


            for (int test = 1; test <= numTests; test++) {
                n = scanner.nextInt();
                m = scanner.nextInt();

                //read n integers into array
                array = new int[n];
                for (int i = 0; i < n; i++) {
                    int val = scanner.nextInt();
                    array[i] = val;
                }
                indicesSeen = new HashSet<>();
                if (isSolvable(0))
                    System.out.println("YES");
                else
                    System.out.println("NO");


            }

        }

        //depth first search
        static boolean isSolvable(int currentIndex) {
            //am at the end, so definitely solvable
            if (currentIndex >= n) return true;
            //invalid move
            if (currentIndex < 0 || array[currentIndex] != 0) return false;

            indicesSeen.add(currentIndex);

            //possible moves are to:
            //1. move m steps forward (only if m > 0);
            if (m > 0 && isSolvable(currentIndex + m))
                return true;
            //2. move one step forward
            if (isSolvable(currentIndex + 1))
                return true;
            //3. move one step backward (don't let it backtrack to a number its seen before)
            if (!indicesSeen.contains(currentIndex - 1) && isSolvable(currentIndex - 1))
                return true;

            // dead path
            return false;
        }


    }

}

package Algorithms.Warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-the-beast
 */
class SherlockAndTheBeast {

    static char FIVE = '5';
    static char THREE = '3';

    static String findDecent(int n) {
        int numFives =0, numThrees =0, remainder=0;
        if (n % 3 == 0) {
            numFives = n;
            numThrees = 0;
            return toString(numFives, numThrees);
        }
        for (int i = (n / 3) * 3; i >= 0 ; i -= 3) {
            numFives = i;
            remainder = (n - numFives);
            if (remainder % 5 == 0) {
                numThrees = remainder;
                return toString(numFives, numThrees);
            }
        }
        return "-1";
    }

    private static String toString(int numFives, int numThrees) {
        StringBuffer answer = new StringBuffer();
        for (int i = 1; i <=numFives ; i ++) {
            answer.append(FIVE);
        }
        for (int i = 1; i <=numThrees ; i ++) {
            answer.append(THREE);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        String answer;
        int n;
        t = in.nextInt();
        for (int i=0;i<t;i++) {
            n = in.nextInt();
            answer = findDecent(n);
            System.out.println(answer);
        }
    }
}
package Algorithms.Strings;

import java.util.Scanner;

/**
 * Created by Wayn on 10/05/2015.
 * https://www.hackerrank.com/challenges/bigger-is-greater
 */
public class BiggerIsGreater {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        t = in.nextInt();
        for (int i = 0; i < t; i++) {
            String s = in.next();
            if (s.length() == 1) {
                System.out.println("no answer");
            } else {
                char[] charArray = s.toCharArray();
                //we're only dealing with string length >= 2 here
                int baseIndex = charArray.length - 1;
                while (true) {
                    //First pass, look for the longest monotonically increasing range (right to left)
                    if (charArray[baseIndex] > charArray[baseIndex - 1]) {
                        int currentIndex = baseIndex - 1;
                        //Look for the first element from the end that is greater and swap with current
                        for (int j = charArray.length - 1; j > currentIndex; j--) {
                            if (charArray[j] > charArray[currentIndex]) {
                                char temp = charArray[currentIndex];
                                charArray[currentIndex] = charArray[j];
                                charArray[j] = temp;
                                break;
                            }
                        }
                        //reverse the sub-array in place from baseIndex till the end;
                        reverse(charArray, baseIndex);
                        System.out.println(charArray);
                        break;
                    }

                    baseIndex--;
                    //if our baseIndex has reached the most significant char, there is no answer
                    if (baseIndex == 0) {
                        System.out.println("no answer");
                        break;
                    }
                }
            }
        }
    }

    private static void reverse(char[] charArray, int from) {
        int forward = from, backward = charArray.length - 1;
        while (forward < backward) {
            char temp = charArray[forward];
            charArray[forward] = charArray[backward];
            charArray[backward] = temp;
            forward++;
            backward--;
        }
    }
}

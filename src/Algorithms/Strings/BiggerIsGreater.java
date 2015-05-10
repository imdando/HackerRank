package Algorithms.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
                int baseIndex = charArray.length - 1, currentIndex = baseIndex - 1;
                List<Character> charRange = new ArrayList<Character>();
                while (true) {
                    //look for the first higher order character greater than the base
                    if (charArray[baseIndex] > charArray[currentIndex]) {
                        //cache the sub array from current index to the end
                        for (int j = currentIndex; j < charArray.length; j++) {
                            if (j != baseIndex) {
                                charRange.add(charArray[j]);
                            }
                        }
                        charArray[currentIndex] = charArray[baseIndex];
                        //sort the remaining characters from currentIndex to baseIndex
                        Collections.sort(charRange);
                        for (Character c : charRange) {
                            currentIndex++;
                            charArray[currentIndex] = c;
                        }
                        System.out.println(charArray);
                        break;
                    }

                    baseIndex--;
                    //if our baseIndex has reached the most significant char, there is no answer
                    if (baseIndex == 0) {
                        System.out.println("no answer");
                        break;
                    }
                    if (baseIndex == currentIndex) {
                        currentIndex--;
                        baseIndex = charArray.length - 1;
                    }
                }
            }
        }
    }
}

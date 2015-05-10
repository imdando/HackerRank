package Algorithms.Strings;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Wayn on 10/05/2015.
 * https://www.hackerrank.com/challenges/alternating-characters
 */
public class AlternatingCharacters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        t = in.nextInt();
        for (int i = 0; i < t; i++) {
            String s = in.next();
            //store our string in a more efficient data structure to manipulate.
            //Linked list seems like a good choice here and we just keep processing the head
            LinkedList<Character> charList = new LinkedList<Character>();
            for (int j = 0; j < s.length(); j++) {
                charList.add(s.charAt(j));
            }
            //assume we always have at least 1 char
            char previous = charList.remove();
            int deletions = 0;
            char current;
            while (!charList.isEmpty()) {
                current = charList.remove();
                // delete if previous and current characters are the same
                if (previous == current) {
                    deletions++;
                } else {
                    previous = current;
                }
            }
            System.out.println(deletions);
        }
    }
}

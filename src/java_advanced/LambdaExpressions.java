package java_advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Wayn on 02/10/2016.
 * https://www.hackerrank.com/challenges/java-lambda-expressions
 */
public class LambdaExpressions {

    interface PerformOperation {
        boolean check(int a);
    }

    static class MyMath {
        public boolean checker(PerformOperation p, int num) {
            return p.check(num);
        }

        PerformOperation is_odd() {
            return a -> a % 2 == 1;
        }

        PerformOperation is_prime() {
            return a -> {
                for (int i = 2; i <= a / 2; i++) {
                    if (a % i == 0)
                        return false;
                }
                return true;
            };
        }

        PerformOperation is_palindrome() {
            return a -> {
                char[] digits = Integer.toString(a).toCharArray();
                for (int i = 0; i <= digits.length / 2; i++) {
                    if (digits[i] != digits[digits.length - i - 1])
                        return false;
                }
                return true;
            };
        }
    }


    public static class Solution {

        public static void main(String[] args) throws IOException {
            MyMath ob = new MyMath();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());
            PerformOperation op;
            boolean ret = false;
            String ans = null;
            while (T-- > 0) {
                String s = br.readLine().trim();
                StringTokenizer st = new StringTokenizer(s);
                int ch = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());
                if (ch == 1) {
                    op = ob.is_odd();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "ODD" : "EVEN";
                } else if (ch == 2) {
                    op = ob.is_prime();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PRIME" : "COMPOSITE";
                } else if (ch == 3) {
                    op = ob.is_palindrome();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

                }
                System.out.println(ans);
            }
        }
    }
}

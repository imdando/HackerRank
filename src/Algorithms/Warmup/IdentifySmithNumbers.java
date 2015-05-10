package Algorithms.Warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/identify-smith-numbers
 */
public class IdentifySmithNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        if (isPrime(num)) {
            System.out.println(1);
            System.exit(0);
        }
        int digitsSum = sumDigits(num);

        int primeFactorSum = sumPrimeFactors(num);

        if (digitsSum == primeFactorSum) {
            System.out.println(1);

        } else {
            System.out.println(0);
        }
    }

    private static int sumPrimeFactors(int num) {
        int primeFactorSum = 0;
        int i = 2;
        while (num > 1) {
            //is it prime?
            if (isPrime(i)) {
                //is it a factor?
                if (num % i == 0) {
                    //add it if so, and reduce our number.
                    primeFactorSum += sumDigits(i);
                    num /= i;
                } else {
                    i++;
                }
            } else {
                i++;
            }
            if (isPrime(num)) {
                primeFactorSum += sumDigits(num);
                break;
            }
        }
        return primeFactorSum;
    }

    private static int sumDigits(int num) {
        int sumDigits = 0;
        while (num > 0) {
            sumDigits += num % 10;
            num /= 10;
        }
        return sumDigits;

    }

    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i < sqrt; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
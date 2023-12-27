package BaekJoon;

import java.util.Scanner;
import java.math.BigInteger;

public class Num6571 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();

            if (a.equals(BigInteger.ZERO) && b.equals(BigInteger.ZERO)) {
                break;
            }

            int count = countFibonacciNumbersInRange(a, b);
            System.out.println(count);
        }

        scanner.close();
    }

    private static int countFibonacciNumbersInRange(BigInteger a, BigInteger b) {
        int count = 0;
        BigInteger fib1 = BigInteger.ONE;
        BigInteger fib2 = BigInteger.valueOf(2);

        while (fib1.compareTo(b) <= 0) {
            if (fib1.compareTo(a) >= 0) {
                count++;
            }

            BigInteger temp = fib1.add(fib2);
            fib1 = fib2;
            fib2 = temp;
        }

        return count;
    }
}


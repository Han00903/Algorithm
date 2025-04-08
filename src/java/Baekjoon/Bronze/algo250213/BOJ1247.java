package java.Baekjoon.Bronze.algo250213;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ1247 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger[] SUM = new BigInteger[3];

        for (int i = 0; i < 3; i++) {
            SUM[i] = BigInteger.ZERO;
        }

        for (int i = 0; i < 3; i++) {
            int N = sc.nextInt();

            for (int j = 0; j < N; j++) {
                BigInteger num = sc.nextBigInteger();
                SUM[i] = SUM[i].add(num);
            }
        }

        for (int k = 0; k < 3; k++) {
            if (SUM[k].equals(BigInteger.ZERO)) {
                System.out.println(0);
            } else if (SUM[k].compareTo(BigInteger.ZERO) > 0) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }

        sc.close();
    }
}

package Baekjoon.Silver.algo241127.BOJ1010;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i=0; i<T; i++){
            int N = sc.nextInt();
            int M = sc.nextInt();

            System.out.println(combination(M, N));
        }
    }
    public static int combination(int m, int n) {
        if (n > m) return 0;
        if (n == 0 || n == m) return 1;

        if (n > m - n) n = m - n;

        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= (m - i);
            result /= (i + 1);
        }
        return result;
    }
}
package Baekjoon.Bronze.algo250212;
import java.util.Scanner;

public class BOJ11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String numStr = sc.next();
        int sum =0;

        for(int i=0; i<N; i++){
            sum += numStr.charAt(i)-'0';
        }
        System.out.print(sum);
        sc.close();
    }
}

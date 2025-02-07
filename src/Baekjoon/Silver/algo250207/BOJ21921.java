package Baekjoon.Silver.algo250207;

import java.util.Arrays;
import java.util.Scanner;
public class BOJ21921 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 전체 날짜 수
        int X = sc.nextInt(); // 연속 날짜 수

        int[] a = new int[N]; // 1일차부터 N일차까지 하루 방문자 수

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));

        int sum =0;
        int count =0; // 최대 방문자 수 합

        // 초기 윈도우 합 계산
        for(int i =0; i<X; i++){
            sum +=a[i];
        }

        int maxSum = sum;

        // 슬라이딩 윈도우 이동
        for(int i=X; i<N; i++){
            sum = sum - a[i-X] + a[i];
            if(sum>maxSum){
                maxSum = sum;
                count =1;
            }else if(sum == maxSum){
                count++;
            }
        }

        if(maxSum == 0){
            System.out.print("SAD");
        }else{
            System.out.println(maxSum);
            System.out.println(count);
        }
    }
}

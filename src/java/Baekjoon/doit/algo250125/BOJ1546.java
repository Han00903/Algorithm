package java.Baekjoon.doit.algo250125;

import java.util.Scanner;

public class BOJ1546 {

    // 변수 N에 과목의 수 입력받기
    // 길이가 N인 1차원 배열 A[] 선언

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int []score = new int[N];

        for(int i=0; i<N; i++){
            score[i] = sc.nextInt();
        }

        long max = 0;
        long sum = 0;

        for(int j=0; j<N; j++){
            if(score[j]>max) max = score[j];
            sum += score[j];
        }

        System.out.println(sum*100.0/max/N);
    }
}

package Baekjoon.doit.algo250113.BOJ250113;

import java.util.Scanner;

public class Main {

//    N값 입력받기
//    길이 N의 숫자를 입력받아 String형 변수 sNum에 저장
//    sNum을 다시 char[]형 변수 cNum에 변환하여 저장
//    int형 변수 sum 선언
//    배열의 각 자릿값을 정수형으로 변환하여 sum에 더하기(for문 사용)
//    sum 출력
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String sNum = sc.next();

        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for(int i =0; i<cNum.length; i++){
            sum += cNum[i]-'0';
        }

        System.out.println(sum);

    }
}

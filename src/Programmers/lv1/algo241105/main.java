package Programmers.lv1.algo241105;

import java.util.Scanner;

public class main {

    public int solution(int n) {

        int[] arr = new int[n];
        int count = 0;
        int sum = 0;

        for(int i=1; i<=n; i++){
            if(n%i==0){
                arr[count]=i;
                count++;

            }
        }
        for(int j=0; j<count; j++){
            sum += arr[j];
        }
        return sum;
    }

    public static void main(String[] args) {  // 프로그램 진입점
        Scanner sc = new Scanner(System.in);
        System.out.println("n의 값을 입력하시오:");
        int n = sc.nextInt();

        main mainObj = new main();  // solution 메서드를 호출하기 위한 객체 생성
        int sum = mainObj.solution(n);  // solution 메서드로 약수의 합 계산

        System.out.println("약수들의 합: " + sum);
    }
}

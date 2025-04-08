package java.ETC.algotest;

import java.util.Scanner;

/*
* 양수만 입력받아 1부터 n까지 합 구하기
*/
public class Main2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;
        int sum = 0;
        do {
            System.out.println("양수 n을 입력해주세요: ");

            n = sc.nextInt();
        }while (n<=0);

        for(int i =0; i<n; i++){
            sum +=i;
        }

        System.out.println(sum);
    }
}
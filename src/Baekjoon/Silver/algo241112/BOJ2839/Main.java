package Baekjoon.Silver.algo241112.BOJ2839;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("배달해야하는 설탕은 몇 킬로그램인가요?");

        int a = sc.nextInt();
        System.out.print("오 "+a+"킬로그램이군요");

        int b = a/5;
        int c = (a-5*b)/3;

        if(a<5){
            System.out.println(-1);
        }else if((a-5*b)<3){
            System.out.println(-1);
        }else {
            System.out.println(b+c);
        }
    }
}

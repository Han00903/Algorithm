package java.Baekjoon.Bronze.algo241205.BOJ2588;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a*(b%10);
        int d = a*((b/10)%10);
        int e = a*(b/100);
        int f = c+d*10+e*100;

        System.out.println("(3): "+c);
        System.out.println("(4): "+d);
        System.out.println("(5): "+e);
        System.out.println("(6): "+f);

    }
}

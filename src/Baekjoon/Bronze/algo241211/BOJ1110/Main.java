package Baekjoon.Bronze.algo241211.BOJ1110;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N < 10){
            N *= 10;
        }

        int origin = N;
        int count =0;

        do{
            int tens = N/10;
            int ones = N%10;
            int sum = tens + ones;

            N = (ones*10) + (sum%10);
            count++;
        }while (origin != N);

        System.out.println(count);
    }

}

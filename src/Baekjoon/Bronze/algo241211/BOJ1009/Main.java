package Baekjoon.Bronze.algo241211.BOJ1009;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int a=0;
        int b=0;

        for(int i=0; i<T; i++){
            a = sc.nextInt();
            b = sc.nextInt();

            a = a%10;
            int result = 1;

            for(int j=0; j<b; j++){
                result = (result*a)%10;
            }

            if(result == 0){
                result = 10;
            }
            System.out.println(result);
        }
    }
}

package java.Baekjoon.Bronze.algo241122.BOJ1009;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i=0; i<T; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum = 1;

            for(int j=0; j<b; j++){
                sum *= a;
                sum = sum%10;
            }

            if(sum==0) sum=10;

            System.out.println(sum);
        }
    }
}

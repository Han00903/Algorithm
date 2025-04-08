package java.Baekjoon.Bronze.algo241124.BOJ1075;
import java.util.*;
public class Main {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int F = sc.nextInt();

        int two = N-(N%100);


        for(int i=0; i<100; i++){
            if((two+i)%F ==0){
                System.out.printf("%02d\n", i);
                break;
            }
        }
    }
}

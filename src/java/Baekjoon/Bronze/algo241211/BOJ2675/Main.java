package java.Baekjoon.Bronze.algo241211.BOJ2675;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i<T; i++){
            int R = sc.nextInt();
            String S = sc.next();

            StringBuilder P = new StringBuilder();

            for(char c : S.toCharArray()){
                for(int j=0; j<R; j++){
                    P.append(c);
                }
            }
            System.out.println(P);
        }
    }
}

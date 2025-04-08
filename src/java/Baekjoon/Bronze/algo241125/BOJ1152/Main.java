package java.Baekjoon.Bronze.algo241125.BOJ1152;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // next와 nextLine에 대하여 정리하기 문자열
        String str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str);


        int count = 0;
        while(st.hasMoreElements()){
            st.nextToken();
            count ++;
        }

        System.out.println(count);

        /**
         * 문자열을 입력한다
         * 공백으로 문자열을 문자로 분리한다
         * 문자의 개수를 구한다
         **/
    }
}

package Baekjoon.doit.algo250114.BOJ11720;
import java.util.Scanner;
public class Main {
    // N값 입력
    // 길이 N의 숫자를 입력받은 후 String형 변수 저장(sNum)
    // int형 변수 sum 선언
    // for문을 사용하여 배열의 각 자릿값을 정수형으로 변환하여 sum에더하여 누적
    // sum 출력
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for(int i=0; i<cNum.length; i++){
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
    }
}

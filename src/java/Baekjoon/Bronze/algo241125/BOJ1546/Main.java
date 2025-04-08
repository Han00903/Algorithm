package java.Baekjoon.Bronze.algo241125.BOJ1546;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 점수 입력
        int N = sc.nextInt();
        float []arr = new float [N];
        float sum = 0;

        for(int i=0; i<N; i ++){
            arr[i] = sc.nextInt();
        }

        // 최댓값&최솟값 구하기
        float max = arr[0];

        for(int j=0; j<arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
            }
        }

        for(int j=0; j<arr.length; j++){
            sum+=arr[j]/max*100;
        }

        double average = sum/N;
        System.out.printf("%.2f\n", average);
    }
}

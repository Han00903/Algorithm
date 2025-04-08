package java.Baekjoon.Silver.algo250207;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ21921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] visitors = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            visitors[i] = Integer.parseInt(st.nextToken());
        }

        int maxSum = 0, currentSum = 0, maxCount = 0;

        // 초기 윈도우 합 계산
        for (int i = 0; i < X; i++) {
            currentSum += visitors[i];
        }

        maxSum = currentSum;
        maxCount = 1;

        // 슬라이딩 윈도우 이동
        for (int i = X; i < N; i++) {
            currentSum = currentSum - visitors[i - X] + visitors[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxCount = 1;
            } else if (currentSum == maxSum) {
                maxCount++;
            }
        }

        if (maxSum == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(maxSum);
            System.out.println(maxCount);
        }
    }
}

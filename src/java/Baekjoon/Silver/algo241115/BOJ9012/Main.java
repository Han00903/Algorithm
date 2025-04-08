package java.Baekjoon.Silver.algo241115.BOJ9012;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 데이터 개수
        sc.nextLine(); // 버퍼 비우기

        for (int i = 0; i < T; i++) {
            String data = sc.nextLine();

            if (isVPS(data)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }

    private static boolean isVPS(String data) {
        int balance = 0; // 괄호의 균형을 나타냄

        for (char ch : data.toCharArray()) {
            if (ch == '(') {
                balance++;
            } else if (ch == ')') {
                balance--;
            }

            // 닫는 괄호가 더 많아지면 VPS가 될 수 없음
            if (balance < 0) {
                return false;
            }
        }

        // 모든 괄호를 처리한 후 균형이 맞아야 함
        return balance == 0;
    }
}

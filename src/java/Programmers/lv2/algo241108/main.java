package java.Programmers.lv2.algo241108;

import java.util.Arrays;

public class main {
    public int solution(int []A, int []B){
        int answer  = 0;

        // Array.sort => 오름차순으로 정렬됨
        Arrays.sort(A);
        Arrays.sort(B);

        // 배열 B를 내림차순으로 정렬하기 위해 배열의 요소 순서 뒤집기
        for(int i=0; i<B.length/2; i++){
            int temp = B[i];
            B[i] = B[B.length-1-i];
            B[B.length-1-i] = temp;
        }

        for(int i =0; i<A.length; i++){
            answer += A[i]*B[i];
        }


        return answer;
    }
}

package Programmers.lv1.algo250214;

import java.util.Arrays;
public class Main12933 {
    public long solution(long n) {
        // 정수->문자로 변환
        char[] str = String.valueOf(n).toCharArray();

        // 문자 내림차순
        Arrays.sort(str); // 오름차순
        StringBuffer sb = new StringBuffer();
        sb.append(str).reverse();

        // 문자를 정수로 변환
        long answer = Long.parseLong(sb.toString());

        return answer;
    }
}
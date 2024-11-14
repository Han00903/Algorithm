package Programmers.lv1.algo241114.two;

public class main {
    public int[] solution(long n) {

        String arrStr = Long.toString(n);
        int[] answer = new int[arrStr.length()];

        for(int i=0; i<arrStr.length(); i++){
            answer[i] = arrStr.charAt(arrStr.length()-i-1)-'0';
        }

        return answer;
    }
}
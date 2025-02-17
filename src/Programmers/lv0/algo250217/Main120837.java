package Programmers.lv0.algo250217;

public class Main120837 {
    public int solution(int hp) {

        int answer = 0;

        answer += hp/5;
        hp %= 5;

        answer += hp/3;
        hp %= 3;

        answer += hp/1;

        return answer;
    }
}
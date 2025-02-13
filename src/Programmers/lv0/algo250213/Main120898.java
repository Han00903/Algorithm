package Programmers.lv0.algo250213;

public class Main120898 {
    public int solution(String message) {
        int answer = 0;
        for(int i=0; i<message.length(); i++){
            answer++;
        }
        answer *=2;
        return answer;
    }
}

package Programmers.lv0.algo250213;

public class Main120836 {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++){
            if(n%i == 0) answer++;
        }
        return answer;
    }
}

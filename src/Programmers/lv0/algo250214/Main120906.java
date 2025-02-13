package Programmers.lv0.algo250214;

public class Main120906 {
    public int solution(int n) {
        int answer = 0;
        while(n !=0){
            answer += n%10;
            n = n/10;
        }
        return answer;
    }
}
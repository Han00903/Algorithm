package Programmers.lv0.algo250213;

public class Main120816 {
    public int solution(int slice, int n) {
        int answer = n/slice;
        int b = n%slice;

        if (b != 0) answer+=1;

        return answer;
    }
}

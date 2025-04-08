package java.Programmers.lv1.algo250216;

public class Main86051 {
    public int solution(int[] numbers){
        int answer = 45;

        for(int i : numbers){
            answer -= i;
        }

        return answer;
    }
}
package java.Programmers.lv0.algo250214;

public class Main120583 {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i : array){
            if(i==n){
                answer++;
            }
        }
        return answer;
    }
}
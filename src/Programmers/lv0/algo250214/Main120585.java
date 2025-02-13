package Programmers.lv0.algo250214;

public class Main120585 {
    public int solution(int[] array, int height) {
        int answer = 0;

        for(int i=0; i<array.length; i++){
            if(height<array[i]) answer++;
        }

        return answer;
    }
}
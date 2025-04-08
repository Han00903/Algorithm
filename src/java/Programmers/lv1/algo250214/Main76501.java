package java.Programmers.lv1.algo250214;

public class Main76501 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i<absolutes.length; i++){
            if(signs[i]){
                absolutes[i] *=1 ;
            }else if(signs[i] == false){
                absolutes[i] *= -1;
            }
            answer += absolutes[i];
        }

        return answer;
    }
}
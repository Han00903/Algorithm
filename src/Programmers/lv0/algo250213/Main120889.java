package Programmers.lv0.algo250213;

public class Main120889 {
    public int solution(int[] sides) {
        int answer;
        int max = sides[0];
        int sum = 0;

        for(int i=0; i<3; i++){
            if(max<sides[i]){
                max = sides[i];
            }else {
                sum += sides[i];
            }
        }

        if(sum <= max){
            answer = 2;
        }else {
            answer = 1;
        }


        return answer;
    }
}

package java.Programmers.lv1.algo241113.three;

public class main {
    public long solution(int a, int b) {
        long answer = 0;

        if(a>b){
            for(int i=b; i<=a; i++){
                answer += (long)i;
            }
        }else if(a<b){
            for(int i=a; i<=b; i++){
                answer += (long)i;
            }
        }else{
            answer = (long)a;
        }

        return answer;
    }
}
package java.Programmers.lv0.algo250214;

public class algo181933 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;

        if(flag == true){
            answer = a+b;
        }else{
            answer = a-b;
        }
        return answer;
    }
}
package java.Programmers.lv1.algo250214;

public class Main12934 {
    public long solution(long n) {
        double num = Math.sqrt(n);
        long answer = -1;

        if(num%1 == 0){
            answer = (long)(Math.pow(num+1,2));
        }

        return answer;
    }
}
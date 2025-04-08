package java.Programmers.lv1.algo241112.three;

public class main {
    public double solution(int[] arr) {

        double answer =0;
        double sum = 0;

        for(int m : arr){
            sum += m;
        }

        answer = sum/arr.length;

        return answer;
    }
}

package java.Programmers.lv0.algo250213;

public class Main120833 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int N = num2-num1+1;
        int[] answer = new int[N];

        for(int i=0; i<N; i++){
            if(num1<=num2){
                answer[i] = numbers[num1];
                num1++;
            }
        }

        return answer;
    }
}

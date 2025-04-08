package java.Programmers.lv0.algo250214;

public class Main120813 {
    public int[] solution(int n) {
        int a = 0;
        int[] answer = new int[(n+1)/2];

        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                answer[a] = i;
                a++;
            }
        }
        return answer;
    }
}
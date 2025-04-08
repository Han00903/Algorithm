package java.Programmers.lv1.algo241113.two;

public class main {
    public int solution(int n) {

        for(int i=1; i<n; i++){
            if(n%i ==1){
                return i;
            }
        }
        return -1;
    }
}

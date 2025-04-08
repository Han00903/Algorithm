package java.Programmers.lv1.algo241112.one;

public class main {
    public int solution(int n) {

        int sum = 0;
        while(n>0){
            int m = n%10;
            sum += m;
            n /= 10;
        }
        return sum;
    }
}
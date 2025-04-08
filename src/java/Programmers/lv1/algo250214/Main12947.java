package java.Programmers.lv1.algo250214;

public class Main12947 {
    public boolean solution(int x) {
        int y = x;
        int sum =0;

        while(y>0){
            sum +=y%10;
            y /=10;
        }

        return x%sum==0;
    }
}
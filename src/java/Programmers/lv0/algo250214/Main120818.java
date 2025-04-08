package java.Programmers.lv0.algo250214;

public class Main120818 {
    public int solution(int price) {
        int answer = 0;

        if(100000<=price && price<300000){
            answer = (int)(price * 0.95);
        }else if(300000<=price && price<500000){
            answer = (int)(price * 0.90);
        }else if(500000<=price ){
            answer = (int)(price * 0.80);
        }else {
            answer = price;
        }

        return answer;
    }
}
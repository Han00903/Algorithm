package java.Programmers.lv0.algo250213;

public class Main120819 {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int price = 5500;

        answer[0] = money/price;
        answer[1] = money%price;

        return answer;
    }
}

package java.Programmers.lv0.algo250213;
import java.util.Arrays;

public class Main120847 {
    public int solution(int[] numbers) {

        Arrays.sort(numbers);

        int answer = numbers[numbers.length-1]*numbers[numbers.length-2];
        return answer;
    }
}

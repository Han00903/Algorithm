package Programmers.lv0.algo250214;
import java.util.Arrays;

public class Main120811 {
    public int solution(int[] array) {

        Arrays.sort(array);

        int answer = array[array.length/2];

        return answer;
    }
}
package java.Programmers.lv1.algo250214;
import java.util.ArrayList;
import java.util.Arrays;

public class Main12910 {
    public int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i : arr){
            if(i%divisor == 0) list.add(i);
        }

        if(list.isEmpty()) list.add(-1);

        int[] answer = list.stream().mapToInt(i -> i).toArray();

        Arrays.sort(answer);

        return answer;
    }
}
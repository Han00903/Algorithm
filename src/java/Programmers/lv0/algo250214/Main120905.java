package java.Programmers.lv0.algo250214;

import java.util.List;
import java.util.ArrayList;

public class Main120905 {
    public List<Integer> solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n == 0){
                list.add(numlist[i]);
            }
        }

        return list;
    }
}
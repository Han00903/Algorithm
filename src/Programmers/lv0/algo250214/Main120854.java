package Programmers.lv0.algo250214;

public class Main120854 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for(int i=0; i<strlist.length; i++){
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}

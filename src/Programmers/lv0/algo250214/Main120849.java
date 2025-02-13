package Programmers.lv0.algo250214;

public class Main120849 {
    public String solution(String my_string) {
        String[] A = {"a", "e", "i", "o", "u"};
        String answer = my_string;
        for(String i : A){
            answer = answer.replace(i, "");
        }

        return answer;
    }
}
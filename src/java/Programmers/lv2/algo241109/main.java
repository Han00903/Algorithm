package java.Programmers.lv2.algo241109;

public class main {
    public String Solution(String s){
        StringBuilder answer = new StringBuilder();
        boolean newWord = true;

        for(char c : s.toCharArray()){
            if (c == ' ') {
                answer.append(c);
                newWord = true;
            }else {
                if (newWord) {
                    answer.append(Character.toUpperCase(c));
                    newWord = false;
                } else {
                    answer.append(Character.toLowerCase(c));
                }
            }
        }
        return answer.toString();
    }
}

package java.Programmers.lv0.algo250213;

public class Main120825 {
    public String solution(String my_string, int n) {
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<my_string.length(); i++){
            char A = my_string.charAt(i);
//            sb.append(String.valueOf(A).repeat(n));
        }

        String answer = sb.toString();
        return answer;
    }

}

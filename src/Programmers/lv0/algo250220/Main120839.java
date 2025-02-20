package Programmers.lv0.algo250220;

public class Main120839 {
    public String solution(String rsp) {
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<rsp.length(); i++){
            char c = rsp.charAt(i);

            if(c == '2'){
                sb.append('0');
            }else if(c == '0'){
                sb.append('5');
            }else if(c == '5'){
                sb.append('2');
            }
        }

        return sb.toString();
    }
}

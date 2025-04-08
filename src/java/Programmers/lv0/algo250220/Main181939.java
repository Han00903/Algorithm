package java.Programmers.lv0.algo250220;

public class Main181939 {
    public int solution(int a, int b) {

        int answer = 0;

        StringBuilder aNum = new StringBuilder();
        aNum.append(a);
        aNum.append(b);
        int aNumber = Integer.parseInt(aNum.toString());

        StringBuilder bNum = new StringBuilder();
        bNum.append(b);
        bNum.append(a);
        int bNumber = Integer.parseInt(bNum.toString());

        if (aNumber > bNumber){
            answer = aNumber;
        }else{
            answer = bNumber;
        }

        return answer;
    }
}
package java.Programmers.lv0.algo250220;

public class Main181928 {

    public int solution(int[] num_list) {

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for(int i : num_list){
            if(i%2 == 0){
                a.append(i);
            }else if(i%2 != 0){
                b.append(i);
            }
        }

        int aNum = Integer.parseInt(a.toString());
        int bNum = Integer.parseInt(b.toString());

        return aNum + bNum;
    }
}
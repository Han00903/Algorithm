package Programmers.lv1.algo250216;

public class Main12943 {
    public int solution(long num) {
        int count = 0;

        while(num != 1){
            if(num % 2 ==0){
                num /=2;
                count++;
            }else if (num % 2 !=0){
                num = (num*3)+1;
                count++;
            }else if (num == 1){
                count = 0;
                break;
            }

        }

        if(count>500){
            count = -1;

        }

        return count;
    }
}

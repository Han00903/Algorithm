package ETC.four;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int inputNum = 19;
        int bin[] = new int[100]; //이진수를 저장할 배열

        int i = 0; //bin 배열의 index카운팅
        int mok = inputNum;

        while(mok > 0) {

            bin[1] = mok % 2;
            mok /=2;
            i++;

        }
        i--;
        for(; i>=0; i--){
            System.out.print(bin[i]);
        }

    }

}

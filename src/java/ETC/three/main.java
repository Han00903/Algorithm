package java.ETC.three;

import java.util.Scanner;

public class main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] inputNum = new int[10]; // 10개의 숫자를 입력받기 위한 배열 크기

        System.out.println("숫자 10개를 입력하세요:");

        for(int i=0; i<10; i++){

            inputNum[i] = sc.nextInt();

        }

        int [] mode = new int[10]; // 0 ~ 10 범위의 숫자를 다룰 수 있도록 배열 크기 설정

        for(int i=0; i<10; i++){

            mode[inputNum[i]]++;

        }

        int modeNum = 0; // 최빈수
        int modeCnt = 0; // 최빈수가 나온 횟수

        for(int i=0; i<10; i++){

            if(modeCnt < mode[i]){

                modeCnt = mode[i];
                modeNum = i;

            }

        }

        System.out.println("최빈수는:" + modeNum + "카운트된 수는: " + modeCnt);


    }
}

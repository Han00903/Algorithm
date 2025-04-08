package java.Programmers.lv2.algo241106;

import java.util.Scanner;

public class main {

    public String solution(String s) {

        String[] arr = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String numStr : arr) {
            int num = Integer.parseInt(numStr);
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return min + " " + max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하시오");

        String input = sc.nextLine();

        main main = new main();
        String result = main.solution(input);

        System.out.println("최소값과 최대값:" +result);

    }
}
package java.Baekjoon.Bronze.algo241211.BOJ10809;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 단어 입력
        String S = sc.next();

        int [] arr = new int[26];
        Arrays.fill(arr, -1);

        for(int i=0; i<S.length(); i++){
            char c = S.charAt(i);
            if (arr[c - 'a'] == -1) {
                arr[c - 'a'] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
package java.ETC.algotest;
import java.util.*;

/*
* 1부터 n까지의 합 구하기
*/
public class Main{
    public static void main2(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum =0;
        for(int i=0;i<n;i++){
            sum+= i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while (i < n) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
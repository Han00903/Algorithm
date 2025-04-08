package java.ETC.algotest;
import java.util.*;
/*
* 직각이등변삼각형 출력하기
*/
public class Main3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.println("몇 단 삼각형입니까?:");
            n = sc.nextInt();
        }while(n <=1);

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();

        }
    }

}

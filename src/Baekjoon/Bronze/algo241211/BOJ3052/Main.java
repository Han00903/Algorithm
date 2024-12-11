package Baekjoon.Bronze.algo241211.BOJ3052;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Set<Integer> result = new HashSet<>();

        for(int i=0; i<10; i++){
            int A = sc.nextInt();
            result.add(A%42);
        }
        System.out.println(result.size());
    }
}

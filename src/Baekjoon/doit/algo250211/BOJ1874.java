package Baekjoon.doit.algo250211;
import java.util.*;

public class BOJ1874 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A[] = new int[N];

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int num =1;
        boolean result = true;
        StringBuilder bf = new StringBuilder();
        for(int i=0; i<N; i++){
            int su = A[i];
            if(su >=num){
                while(su>=num){
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }else{
                int n = stack.pop();
                if(n > su){
                    System.out.println("NO");
                    result = false;
                    break;
                }else{
                    bf.append("-\n");                }
            }
        }
        if(result) {
            System.out.println(bf.toString());
        }
    }
}

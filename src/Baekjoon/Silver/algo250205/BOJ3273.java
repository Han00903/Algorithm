package Baekjoon.Silver.algo250205;
import java.util.*;
public class BOJ3273 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        Arrays.sort(arr);

        int left = 0;
        int right = n-1;
        int sum = 0;

        while(left < right){
            if(arr[left]+arr[right] == x){
                sum ++;
                left ++;
                right --;
            }else if(arr[left]+arr[right] > x){
                right --;
            }else if(arr[left]+arr[right] < x){
                left ++;
            }
        }

        System.out.println(sum);
    }

}

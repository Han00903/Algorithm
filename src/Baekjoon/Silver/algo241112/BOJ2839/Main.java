package Baekjoon.Silver.algo241112.BOJ2839;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;

        while (a >= 0) {
            if (a % 5 == 0) {
                count += a / 5;
                System.out.println(count);
                return;
            }
            a -= 3;
            count++;
        }
        
        System.out.println(-1);
    }
}

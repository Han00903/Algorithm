package java.ETC.algo241109.two;

public class main {
    public static void main(String[] args){
        int n = 5;
        int m = 3;
        int sum = 1;

        for(int i=1; i<=m; i++){

            sum *=n;
        }

        System.out.println(sum);
    }
}

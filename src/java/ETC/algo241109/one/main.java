package java.ETC.algo241109.one;

public class main {
    public static void main(String[] args){

        int n = 5;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(n-i-j<=1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

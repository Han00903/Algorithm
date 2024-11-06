package ETC.algo241107.two;

public class main {
    public static void main(String[] args){

        int s = 2;
        int f = 3;

        for(int i=1; i <= 9; i++){
            for(int j=s; j<=f; j++){
                System.out.printf("%2d * %2d = %2d", j, i, j*i);
            }
            System.out.println();
        }
    }
}

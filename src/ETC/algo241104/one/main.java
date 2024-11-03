package ETC.algo241104.one;

public class main {
    public static void main(String[] args){

        int inputNum = 5;
        int accNum = 1;

        for(int i=1; i<=inputNum; i++){
            accNum = accNum * i;
        }
        System.out.print(accNum);
    }
}

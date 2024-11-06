package ETC.algo241106.two;

public class main {

    public static void main(String[] args){

        int inputNum = 4;
        int arr[][] = new int[inputNum][inputNum];

        for(int i = 0; i<inputNum; i++){
            for(int j =0; j<inputNum; j++){
                arr[i][j] = i+1+(i+1)*j;
                System.out.printf("%5d",arr[i][j]);
            }
            System.out.println();
        }

    }
}
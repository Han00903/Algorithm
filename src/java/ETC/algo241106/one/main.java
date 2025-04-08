package java.ETC.algo241106.one;

public class main {
    public static void main(String[] args){

        int inputNum =4;
        int arr[][] = new int[inputNum][inputNum];

        int num =1;
        for(int i = 0; i < inputNum; i++){
            for(int j = 0; j < inputNum; j++){
//                arr[j][i] = i+(inputNum-1)*j+(j+1);
//                System.out.printf("%5d", arr[j][i]);
                arr[j][i] = num;
                System.out.printf("%5d", arr[i][j]);
                num++;
            }
            System.out.println();
        }
    }
}

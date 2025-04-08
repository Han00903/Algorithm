package java.ETC.algo241105.two;

import java.sql.SQLOutput;

public class main {

    public static void main(String[] args){

        int inputNum = 5;
        int arr[][]=new int[inputNum][inputNum];

        for(int i=0; i<inputNum; i++){
            if(i%2==0){
                for(int j=0; j<inputNum; j++){
                    arr[i][j] =  i * inputNum + j +1;
                }
            }else if(i%2!=0){
                for (int j = inputNum - 1; j >= 0; j--) {
                    arr[i][j]=i * inputNum + inputNum - j;
                }
            }
        }
        for(int i=0; i<inputNum; i++){

            for(int j=0; j<inputNum; j++){
                System.out.printf("%5d", arr[i][j]);
            }
            System.out.println();
        }
    }
}

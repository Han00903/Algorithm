package ETC.algo241111.one;

public class main {
    public static void main(String[] args){

        boolean arr[] = new boolean[101];
        int inArr[] = new int [101];

        inArr[0] = 1;
        inArr[1] = 1;
        inArr[2] = 3;
        inArr[4] = 24;
        inArr[5] = 2;
        inArr[6] = 3;

        for(int i = 0; i<=100; i++){
            arr[inArr[i]] = true;
        }

        for(int i = 0; i <= 100; i++){
            if(arr[i]){
                System.out.print(i+" ");
            }
        }
    }
}

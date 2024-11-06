package ETC.algo241107.one;

public class main {

    public static void main(String[] args){

        int inputNum = 1234567891;
        int arr[] = new int [10];

        while (inputNum > 0) {
            arr[inputNum%10]++;
            inputNum /=10;

        }

        for(int i =0; i<10; i++){
            System.out.println(i+": "+arr[i]);
        }
    }
}

package ETC.algo241104.two;

public class main {

    public static void main(String[] args) {

        int inputNum = 1232;
        int sumNum = 0;

        while(inputNum > 0){

            int digit = inputNum % 10;

            sumNum +=digit;

            inputNum /= 10;
        }

        System.out.print("모든 자릿수의 합:"+sumNum);

    }
}

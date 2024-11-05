package ETC.algo241105.one;

public class main {

    public static void main(String[] args) {

        int inputNum =4;
        int num =1;

        for(int j=0;j<inputNum;j++) {

            for(int i = 0; i<inputNum; i++) {

                System.out.printf("%4d",num);
                num++;
            }
            System.out.println();
        }
    }

}

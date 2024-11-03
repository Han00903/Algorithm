package ETC.seven;

public class main {

    public static void main(String[] args) {

        int num = 13;
        boolean isPrimeNumber = true;

        for (int i = 2; i<= num -1; i++) {
            if(num%i==0) {
                isPrimeNumber = false;
            }
        }

        if(isPrimeNumber) {
            System.out.println(num + ": 소수입니다.");
        }else{
            System.out.println(num + ": 소수가 아닙니다.");
        }

    }
}

package ETC.algo241111.two;

public class main {

    public static  void main(String[] args){

        String n = "12321";

        int len = n.length();
        boolean flag = true;

        for(int i = 0; i<len/2;i++){
            if(n.charAt(i) != n.charAt(len-i-1)){
                flag = false;
            }
        }
        System.out.println(flag);



    }
}
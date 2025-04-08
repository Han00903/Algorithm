package java.ETC.algo241112.one;

public class main {

    public static void main(String [] args){
        String n = "ADEFH";

        char tmp;
        char []arr = n.toCharArray();
        int len = n.length();

        for(int i =0; i<len/2; i++){
            tmp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1] = tmp;
        }

        System.out.println(arr);
    }
}

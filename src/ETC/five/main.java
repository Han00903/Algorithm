package ETC.five;

public class main {
    public static void main(String[] args){

        String input = "helloWorlD";
        char []arr;
        arr = input.toCharArray();
        System.out.println(arr);

        for (int i=0; i<arr.length; i++) {
            if(arr[i] >='a'&& arr[i]<='z') {
                arr[i] =(char)(arr[i] + ('A'-'a'));

            }else if(arr[i] >='A'&& arr[i]<='Z') {
                arr[i] =(char)(arr[i] - ('A'-'a'));
            }
        }
        System.out.print(arr);
    }
}

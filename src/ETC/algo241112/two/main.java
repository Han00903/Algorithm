package ETC.algo241112.two;

public class main {
    public static void main(String[] args){
        int m[] = {7, 100, 95, 90, 80, 70, 60, 50};
        int sum = 0;
        double rate = 0;


        // 배열의 총합 구하기
        for(int i = 0; i<m[0]; i++){
            sum += m[i];
        }
        System.out.println(sum); // 총합 정상적으로 출력

        // 평균값 구하기
        double average = (double) sum/m[0];
        System.out.println(average); // 평균값 출력

        // 평균값보다 큰 학생들 수 구하기
        for(int i=0; i<m[0]; i++){
            if(average<m[i]){
                rate++;
            }
        }
        double percentAverage = (double) rate / m[0] * 100;
        System.out.printf("평균을 넘은 학생의 비율: %.2f%%\n", percentAverage);
    }
}
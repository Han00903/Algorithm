package ETC.one;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        student st1 = new student("손오공", "1234");
        student st2 = new student("사오정", "5678");
        student st3 = new student("저팔계", "9101");

        ArrayList <student>list = new ArrayList<student>();

        list.add(st1);
        list.add(st2);
        list.add(st3);

        for (student stu : list) {

            System.out.println(stu.getName());
            System.out.println(stu.getNo());

        }

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("계속 검색을 하고싶으면 y, 종료하고싶으면 n");

            String input = sc.next();

            if(input.equals("y")) {

                System.out.println("검색을 시작합니다.");
                String name = sc.next();
                boolean flag = false;

                for (student stu : list){
                    if(stu.getName().equals(name)) {
                        System.out.print("해당하는 학생의 학번은: "+stu.getNo());
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("해당하는 학생 이름이 없습니다.");
                }

            }else if (input.equals("n")) {

                break;

            }

        }

        System.out.println("프로그램이 종료되었습니다.");

    }
}
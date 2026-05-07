package exam_while;

import java.util.Scanner;

public class GugudanExample {
    static void main(String[] args) {

        int i = 1;
        Scanner input = new Scanner(System.in); // 데이터 입력

        System.out.print("알고싶은 단을 입력하시오.");
        int dan = input.nextInt(); // 입력값

        while (dan < 2 || dan > 9) { // 2 -9 단 이외에는 반복으로 다시 출력
            System.out.print("구구단은 2단 ~ 9단까지만 출력이 가능합니다. 다시 입력해주세요.");
            dan = input.nextInt();
        }

//        while (true) {
//            System.out.println(dan + " * " + i + " = " + (dan * i));
//            i++;
//
//            if (i > 9) {
//                break;
//            }
//        }

        while (i <= 9) { // 1부터 9까지 출력 > ex) 4 * 1 = 4
            System.out.println(dan + " * " + i + " = " + (dan * i));
            i++;
        }
    }
}

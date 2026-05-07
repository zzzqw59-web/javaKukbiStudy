package exam_break;

import java.util.Scanner;

public class BreakExample {
    static void main(String[] args) {
        /*
        사용자가 입력한 점수의 총점, 평균을 내는 프로그램을 만드시오
        단, 종료는 0~100 사이가 아닌 값을 입력하면 됨
         */

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("0~100 사이의 값을 입력하시오. , 그 외를 입력하면 종료");
            int num = input.nextInt();
            if (num > 100 || num < 0) {
                System.out.println("처음부터 다시 입력하세요.");
                break;
            }

            sum += num;
            count++;
        }
        double average = (double) sum / count;
        System.out.println("입력한 점수의 총점: " + sum + ", 평균: " + average);
    }
}

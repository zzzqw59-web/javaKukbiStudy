package exam_array;

import java.util.Scanner;

public class SchoolCafeteriaExample {
    static void main(String[] args) {
        /*
        20명의 학생에게 학교 식당의 만족도를 조사한 결과를 처리하는 프로그램
        만족도를 3단계로 하여 불만족(1), 보통(2), 만족(3)을 응답한 결과에 따라
        만족도별 응답 횟수를 출력하는 코드를 작성하시오.
         */

        Scanner input = new Scanner(System.in);

        int[] students = new int[20];

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < students.length; i++) {
            int value;

            do {
                System.out.println("만족도를 체크하시오. [불만족 -> 1], [보통 -> 2], [만족 -> 3]");
                value = input.nextInt();

            } while (value > 3 || value < 0);

            students[i] = value;

            if (value == 1) {
                count1++;
            } else if (value == 2) {
                count2++;
            } else if (value == 3) {
                count3++;
            }


        }
        System.out.println("만족도별 점수");
//        System.out.println("불만족: " + count1 + ", 보통: " + count2 + ", 만족: " + count3);
    }
}

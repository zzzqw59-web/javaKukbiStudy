package exam_array;

import java.util.Scanner;

public class ScoreTest {
    static void main(String[] args) {
        /*
        학생 수를 입력받고, 그 수(학생수)만큼 점수를 입력받아
        평균을 구하도록 프로그램을 만드시오.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("학생의 수를 입력하시오.");
        int students = input.nextInt();
        int sum = 0;

        System.out.println("학생들의 수만큼 점수를 각각 입력하시오.");
        int[] scores = new int[students];

        for (int i = 0; i < scores.length; i++) {
            while (students != scores[i]) {
                System.out.println("학생들의 수만큼 입력해야합니다.");
                break;
            }
            sum += scores[i];
        }
        System.out.println(sum);
    }
}

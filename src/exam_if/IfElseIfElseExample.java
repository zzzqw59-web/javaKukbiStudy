package exam_if;

import java.util.Scanner;

public class IfElseIfElseExample {
    static void main(String[] args) {
        /*
        사용자로 하여금 점수(score)를 입력받아 학점(grade)을 출력하는 프로그램을 작성해주세요.
         */

        int score;
        int grade;

        Scanner input = new Scanner(System.in);
        System.out.print("점수는 0~100 사이로 입력해주세요.");
        score = input.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.printf("점수 = %d 학점 = %c", score, grade);

        input.close();
    }
}

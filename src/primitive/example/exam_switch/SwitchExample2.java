package primitive.example.exam_switch;

import java.util.Scanner;

public class SwitchExample2 {
    static void main(String[] args) {
        int score;
        char grade;

        Scanner input = new Scanner(System.in);
        System.out.println("점수는 0~100 사이로 입력해주세요.");
        score = input.nextInt();

        System.out.printf("점수 = %d", score);

        if (score <= 100 && score >= 0) {
            switch (score / 10) {
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                default:
                    grade = 'F';
            }
            System.out.printf(", 학점 = %c" , grade);
        } else {
            System.out.println(", 입력된 숫자는 0~100의 범위를 벗어났습니다.");
        }
    }
}

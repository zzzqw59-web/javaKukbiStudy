package primitive.example.exam_switch;

import java.util.Scanner;

public class SwitchExample2Ref {
    static void main(String[] args) {
        int score;

        Scanner input = new Scanner(System.in);
        System.out.println("점수는 0~100 사이로 입력해주세요.");
        score = input.nextInt();

        System.out.printf("점수 = %d", score);

        if (score <= 100 && score >= 0) {
            char grade = switch (score / 10) {
                case 10, 9 -> 'A';
                case 8 -> 'B';
                case 7 -> 'C';
                case 6 -> 'D';
                default -> 'F';
            };
            System.out.printf(", 학점 = %c", grade);
        } else {
            System.out.println(", 입력된 숫자는 0~100의 범위에서 벗어났습니다.");
        }
    }
}

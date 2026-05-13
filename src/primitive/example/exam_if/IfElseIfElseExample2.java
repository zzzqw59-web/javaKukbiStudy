package primitive.example.exam_if;

import java.util.Scanner;

public class IfElseIfElseExample2 {
    static void main(String[] args) {
        int score;
        char grade = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("점수는 0~100 사이로 입력해주세요.");
        score = input.nextInt();

        // 2. 작성 완료 후 위 코드에서 0 ~ 100 사이로 입력하지 않았다면
        // "점수는 0과 100 사이로 입력해주셔야 합니다." 라고 출력 되도록 한다.

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else if (score >= 0) {
            grade = 'F';
        } else {
            System.out.println("점수는 0과 100 사이로 입력해주셔야 합니다.");
        }

        if (score <= 100 && score > 0) {
            System.out.println("입력하신 점수는: " + score + "점이고, 등급은: " + grade + "입니다.");
        } else {
            return;
        }
        input.close();

    }
}

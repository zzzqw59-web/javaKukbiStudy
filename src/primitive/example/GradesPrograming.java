package primitive.example;

import java.util.Scanner;

public class GradesPrograming {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("중간고사, 기말고사, 레포트, 출석 점수를 입력하세요.");
        int middleScore = input.nextInt();
        int finalScore = input.nextInt();
        int reportScore = input.nextInt();
        int attendanceScore = input.nextInt();
        char grade;
        String value = "";

        double mfScore = (middleScore + finalScore) / 2.0;
        double totalScore = mfScore * 0.6 + reportScore * 0.2 + attendanceScore * 0.2;

        if (totalScore >= 90) {
            grade = 'A';
        } else if (totalScore >= 80) {
            grade = 'B';
        } else if (totalScore >= 70) {
            grade = 'C';
        } else if (totalScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        switch (grade) {
            case 'A':
            case 'B':
                value = "excellent";
                break;
            case 'C':
            case 'D':
                value = "good";
                break;
            case 'F':
                value = "poor";
                break;
            default:
                value = "unknown";
        }

        input.close();

        System.out.println("결과입니다.");
        System.out.println("중간고사: " + middleScore);
        System.out.println("기말고사: " + finalScore);
        System.out.println("레포트: " + reportScore);
        System.out.println("출석점수: " + attendanceScore);
        System.out.println();
        System.out.printf("성적: %.2f\n", totalScore);
        System.out.println();
        System.out.println("학점: " + grade);
        System.out.println("평가: " + value);
    }
}

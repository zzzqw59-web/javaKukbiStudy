package primitive.example.exam_array;

import java.util.Scanner;

public class ScoreArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] course = {"java", "C++", "HTML5", "컴퓨터구조", "데이터베이스"};
        int[] score = {95, 88, 76, 62, 55};

        // 출력문과 과목명은 배열로 접근하여 출력
        System.out.println("[과목 정보] - 과목명은 대소문자 정확하게 입력해주세요. [종료는 \"종료\" 입력]");

        for (int i = 0; i < course.length; i++) {
            System.out.print(course[i]);
            if (i < course.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        while (true) {
            System.out.print("과목 이름 >> ");
            String name = input.nextLine();

            if (name.equals("종료")) {
                break;
            }

            if (name.isEmpty()) {
                continue;
                // 빈줄 입력 무시
            }

            boolean found = false;

            for (int i = 0; i < score.length; i++) {
                if (course[i].equals(name)) {
                    System.out.println(name + "의 점수는 " + score[i]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("없는 과목입니다.");
            }
        }
        System.out.println("프로그램을 종료합니다.");
        input.close();

    }
}

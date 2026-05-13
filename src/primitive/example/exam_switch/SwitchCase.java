package primitive.example.exam_switch;

import java.util.Scanner;

public class SwitchCase {
    static void main(String[] args) {
        /*
        1층 = 약국 , 2층 = 정형외과 , 3층 = 피부과, 4층 = 치과, 5층 = 헬스클럽
         */
        Scanner input = new Scanner(System.in);
        System.out.print("1~5층 수를 입력해주세요.");

        int grade = input.nextInt();

        String info = switch (grade) {
            case 1 -> "약국";
            case 2 -> "정형외과";
            case 3 -> "피부과";
            case 4 -> "치과";
            case 5 -> "헬스클럽";
            default -> null;
        };

        if (info == null) {
            System.out.println("해당 층은 존재하지 않습니다.");
        } else {
            System.out.println(grade + "층은 " + info + "입니다.");
        }

        input.close();
    }
}

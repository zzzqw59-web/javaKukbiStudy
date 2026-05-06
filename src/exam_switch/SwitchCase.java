package exam_switch;

import java.util.Scanner;

public class SwitchCase {
    static void main(String[] args) {
        /*
        1층 = 약국 , 2층 = 정형외과 , 3층 = 피부과, 4층 = 치과, 5층 = 헬스클럽
         */
        Scanner input = new Scanner(System.in);
        System.out.print("각 층 정보를 제공하고자 합니다. 1~5층 수를 입력해주세요.");

        int grade = input.nextInt();
        String info;

        switch (grade) {
            case 1:
                info = "약국";
                break;
            case 2:
                info = "정형외과";
                break;
            case 3:
                info = "피부과";
                break;
            case 4:
                info = "치과";
                break;
            case 5:
                info = "헬스클럽";
                break;
            default:
                info = null;
        }

        if (info == null) {
            System.out.println("해당 층은 존재하지 않습니다.");
        } else {
            System.out.println(grade + "층은 " + info + "입니다.");
        }
    }
}

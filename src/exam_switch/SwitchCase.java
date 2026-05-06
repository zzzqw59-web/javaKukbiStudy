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

        switch (grade) {
            case 1:
                System.out.println("1층은 약국입니다.");
                break;
            case 2:
                System.out.println("2층은 정형외과입니다.");
                break;
            case 3:
                System.out.println("3층은 피부과입니다.");
                break;
            case 4:
                System.out.println("4층은 치과입니다.");
                break;
            case 5:
                System.out.println("5층은 헬스클럽입니다.");
                break;
            default:
                System.out.println("해당 층은 존재하지 않습니다.");
        }
    }
}

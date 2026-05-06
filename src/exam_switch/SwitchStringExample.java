package exam_switch;

import java.util.Scanner;

public class SwitchStringExample {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("[실행예시]");
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("7. 종료");
        System.out.print("메뉴 번호를 입력하세요.");

        int count = input.nextInt();
        String menu;

        switch (count) {
            case 1:
                menu = "입력";
                break;
            case 2:
                menu = "수정";
                break;
            case 3:
                menu = "조회";
                break;
            case 4:
                menu = "삭제";
                break;
            case 7:
                menu = "종료";
                break;
            default:
                menu = null;
        }

        if (menu == null) {
            System.out.println("해당 번호는 존재하지 않습니다.");
        } else {
            System.out.println(menu + " 메뉴입니다.");
        }
        input.close();

    }
}

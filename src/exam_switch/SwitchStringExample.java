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

        switch (count) {
            case 1:
                System.out.println("입력 메뉴입니다.");
                break;
            case 2:
                System.out.println("수정 메뉴입니다.");
                break;
            case 3:
                System.out.println("조회 메뉴입니다.");
                break;
            case 4:
                System.out.println("삭제 메뉴입니다.");
                break;
            case 7:
                System.out.println("종료 메뉴입니다.");
                break;
            default:
                System.out.println("해당 메뉴는 존재하지 않습니다.");
        }
        input.close();

    }
}

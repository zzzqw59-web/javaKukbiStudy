package primitive.example.exam_switch;

import java.util.Scanner;

public class SwitchCaseExample {
    static void main(String[] args) {
        /*
        사용자에게 관리자, 회원, 비회원 중에 하나를 입력 받아 각 등급이 행할수 있는 권한을 출력하세요.
        단, 관리자는 회원관리, 게시글 관리, 게시글 조회, 댓글 작성이 가능하고
        회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
        비회원은 게시글 조회만 가능합니다.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("당신은 관리자인가요? 회원인가요? 비회원인가요?");

        String grade = input.nextLine().trim();

        switch (grade) {
            case "관리자":
                System.out.println("회원관리, 게시글 관리, 게시글 조회, 댓글작성");
                break;
            case "회원":
                System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
                break;
            case "비회원":
                System.out.println("게시글 조회");
                break;
            default:
                grade = null;
        }

        if (grade == null) {
            System.out.println("해당 등급은 존재하지 않습니다.");
        } else {
            System.out.println(grade);
        }
        input.close();
    }
}

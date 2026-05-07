package exam_while;

import java.util.Scanner;

public class WhileExample3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1 이상의 숫자를 입력하세요.");
        int num = input.nextInt();

        while (num < 1) {
            System.out.print("잘못 입력하셨습니다. 다시 입력해주세요.");
            num = input.nextInt();
        }

        while (num > 0) {
            System.out.print(num-- + " ");
        }
    }
}

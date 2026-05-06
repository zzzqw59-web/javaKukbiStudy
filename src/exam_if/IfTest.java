package exam_if;

import java.util.Scanner;

public class IfTest {
    static void main(String[] args) {
        /*
        두 정수를 입력받아 작은값, 큰 값 순으로 출력되도록 프로그램을 작성해주세요.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("정수 2개를 입력해주세요.");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("작은 값 : " + num2 + ", 큰 값: " + num1);
        } else {
            System.out.println("작은 값: " + num1 + ", 큰 값: " + num2);
        }

        input.close();

    }
}

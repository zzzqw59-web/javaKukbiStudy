package exam_input;

import java.util.Scanner;

public class TWoNumberSum2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("두 수의 숫자를 공백을 기준으로 입력해주세요.");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("두 수의 합은: " + num1 + num2);
        System.out.println("두 수의 합은: " + (num1 + num2));
    }
}

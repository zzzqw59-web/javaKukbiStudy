package exam_input;

import java.util.Scanner;

public class TwoNumberSum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요.");
        int x = input.nextInt();

        System.out.print("두번째 숫자를 입력하세요.");
        int y = input.nextInt();

        int sum = x + y;

        System.out.println("두 숫자의 합은: " + sum);
        input.close();
    }
}

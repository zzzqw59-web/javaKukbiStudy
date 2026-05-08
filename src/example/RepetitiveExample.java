package example;

import java.util.Scanner;

public class RepetitiveExample {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int checkNumber;

        do {
            String text = """
                    연산자를 1~4번으로 선택하고, 종료는 5번을 입력하세요.
                    1. +
                    2. -
                    3. *
                    4. /
                    5. 종료
                    선택 >> """;
            System.out.print(text);
            checkNumber = input.nextInt();

            if (checkNumber == 5) {
                System.out.println("종료합니다.");
                return;
            }

        } while(checkNumber > 5 || checkNumber < 0);

        System.out.println("사칙 연산을 할 두 수를 입력하세요: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (checkNumber == 1) {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (checkNumber == 2) {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (checkNumber == 3) {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (checkNumber == 4) {
            if (num2 == 0) {
                System.out.println("0으로는 나눌 수 없습니다.");
            } else {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
        }


    }
}

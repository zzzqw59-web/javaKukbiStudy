package primitive.example;

import java.util.Scanner;

public class OperationExample {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;

        System.out.println("두 수를 입력하세요.");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("연산자를 입력하세요");
        char operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    break;
                } else {
                    result = num1 / num2;
                    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                    break;
                }

            default:
                System.out.println("적절하지 않은 연산자입니다.");
        }
    }
}

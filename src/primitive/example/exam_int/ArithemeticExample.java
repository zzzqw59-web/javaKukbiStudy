package primitive.example.exam_int;

import java.util.Scanner;

public class ArithemeticExample {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요.");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("덧셈 결과: " + (num1 + num2));
        System.out.println("뺄셈 결과: " + (num1 - num2));
        System.out.println("곱셈 결과: " + (num1 * num2));
        System.out.println("나눗셈 결과: " + (num1 / num2));
        System.out.println("나머지 결과: " + (num1 % num2));
    }
}

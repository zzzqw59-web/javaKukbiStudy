package primitive.example.exam_input;

import java.util.Scanner;

public class IntExample {
    static void main(String[] args) {
        // 두 수를 입력 받아, 교환 하고, 출력
        Scanner input = new Scanner(System.in);
        System.out.print("두 수를 입력하세요.");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("두 수는 " + num1 + "," + num2 + "입니다.");

        System.out.println("=======");

        // 두 수를 입력 받고
        // 하나는 증가
        // 하나는 감소
        // 그 이후 출력
        Scanner value = new Scanner(System.in);
        System.out.println("두 수를 입력하세요.");
        int value1 = value.nextInt() + 1;
        int value2 = value.nextInt() - 1;

        System.out.println("첫번째 입력한 숫자는 " + value1 + "이고, 두번째 입력한 숫자는 " + value2 + "입니다.");

        value.close();
    }
}

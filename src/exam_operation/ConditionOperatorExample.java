package exam_operation;

import java.util.Scanner;

public class ConditionOperatorExample {
    static void main(String[] args) {
        int x = 100;
        int y = 200;

        // (조건식) ? 참 : 거짓
        System.out.println("두 수(100, 200) 중에서 최대값: " + ((x > y) ? x : y));
        System.out.println("두 수(100, 200) 중에서 최대값: " + Math.max(x, y));

        // 임의의 수(키보드로 입력받은 값)를 가진 변수를 선언하고 그 값이 짝수인지 홀수인지 출력하시오.
        Scanner input = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요.");

        int num = input.nextInt();
        System.out.println(num + "은");
        System.out.println((num % 2 == 0) ? "짝수" : "홀수");
        System.out.println("입니다.");

        // 두 수의 차를 출력하시오. 단, 큰 수에서 작은 수를 빼서 결과를 출력하시오.
        System.out.print("두 수를 공백단위로 구분하여 입력하세요.");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = (num1 > num2) ? (num1 - num2) : (num2 - num1);
        System.out.println("두 수의 차는 " + result + "입니다.");

        input.close();
    }
}

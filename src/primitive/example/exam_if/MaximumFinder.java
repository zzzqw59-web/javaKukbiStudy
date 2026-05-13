package primitive.example.exam_if;

import java.util.Scanner;

public class MaximumFinder {
    static void main(String[] args) {
        /*
        3개의 정수를 입력 받아서 최대값을 출력하는 프로그램을 만드시오.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("정수 3개를 입력하시오.");
        int num1 = input.nextInt(); // 10
        int num2 = input.nextInt(); // 20
        int num3 = input.nextInt(); // 30
        input.close(); // 더 이상 입력 받지 않을 것

        int maxNumber = num1;

        if (maxNumber < num2) {
            maxNumber = num2;
        }

        if (maxNumber < num3) {
            maxNumber = num3;
        }

        System.out.println("최대값: " + maxNumber);

        // 이 방법도 가능
        int max = Math.max(num1, Math.max(num2, num3));
        System.out.println(max);




    }
}

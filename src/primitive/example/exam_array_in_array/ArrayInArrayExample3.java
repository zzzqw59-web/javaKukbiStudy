package primitive.example.exam_array_in_array;

import java.util.Scanner;

public class ArrayInArrayExample3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        do {
            System.out.println("1 ~ 10 이상의 정수 두개를 입력하시오.");

            System.out.print("행 크기: ");
            num1 = input.nextInt();
            System.out.print("열 크기: ");
            num2 = input.nextInt();

            if ((num1 < 0 || num1 > 10) || (num2 < 0 || num2 > 10)) {
                System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야합니다. 다시 입력해주세요.");
            } else {
                break;
            }
        } while (true);

        int[][] spell = new int[num1][num2];















    }
}

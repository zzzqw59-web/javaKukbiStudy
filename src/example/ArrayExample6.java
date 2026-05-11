package example;

import java.util.Scanner;

public class ArrayExample6 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("10 미만의 양수를 2개 입력하시오.");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        while (true) {
            if ((num1 > 10 || num1 < 0 ) || (num2 > 10 || num2 < 0 )) {
                System.out.println("다시 입력하세요.");
                num1 = input.nextInt();
                num2 = input.nextInt();
            } else {
                break;
            }
        }

        numbers[0] = num1;
        numbers[1] = num2;

        for (int i = 2; i < numbers.length; i++) {

        }


    }
}

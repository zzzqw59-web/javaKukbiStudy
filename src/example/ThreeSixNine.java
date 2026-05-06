package example;

import java.util.Scanner;

public class ThreeSixNine {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1~99까지의 정수 중에 3개를 입력하시오.");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int count = 0;

        boolean isInrange = (num1 <= 99 && num1 >= 1) && (num2 <= 99 && num2 >= 1) && (num3 <= 99 && num3 >= 1);

        if (!isInrange) {
            System.out.println("값의 범위를 초과하였습니다.");
            return;
        }

        if (String.valueOf(num1).contains("3") || String.valueOf(num1).contains("6") || String.valueOf(num1).contains("9")) {
            count ++;
        }

        if (String.valueOf(num2).contains("3") || String.valueOf(num2).contains("6") || String.valueOf(num2).contains("9")) {
            count ++;
        }

        if (String.valueOf(num3).contains("3") || String.valueOf(num3).contains("6") || String.valueOf(num3).contains("9")) {
            count ++;
        }

        if (count == 1) {
            System.out.println("짝");
        } else if (count == 2) {
            System.out.println("짝짝");
        } else if (count == 3) {
            System.out.println("짝짝짝");
        }
    }
}

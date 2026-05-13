package primitive.example.exam_for;

import java.util.Scanner;

public class MaxMinExample {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        10개의 데이터를 입력 받아 최소값, 최대값을 구하여 출력하는 코드를 작성하시오.
         */

        // 초기값을 정수형의 최소/최대 한계값으로 설정
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "번째 수를 입력하세요.");
            int num = input.nextInt();

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        input.close();
        System.out.printf("최대값: %d\t최소값: %d\n", max, min);
    }
}

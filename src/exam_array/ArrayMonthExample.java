package exam_array;

import java.util.Scanner;

public class ArrayMonthExample {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int su;

        System.out.println("각 월의 마지막 일을 출력하고자 합니다. (1~12월)");

        do {
            System.out.println("원하는 월: ");
            su = input.nextInt();
        } while (su < 1 || su > 12);  // 조건식이 참일 경우 반복

        System.out.println(su + "월은 " + month[su - 1] + "일입니다."); // month[인덱스 - 1]
        input.close();
    }
}

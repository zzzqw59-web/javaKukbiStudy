package exam_while;

import java.util.Scanner;

public class WhileExample2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("양수를 입력하세요.");
        int num = input.nextInt();
        int sum = 0;

        while (true) {
            sum += num;
            num--;

            if (num == -1) {
                break;
            }
        }
        System.out.println("100부터 0까지의 합: " + sum);
        System.out.println("현재 i의 값: " + num);
    }
}

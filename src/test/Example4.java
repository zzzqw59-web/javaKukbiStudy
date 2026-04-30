package test;

import java.util.Scanner;

public class Example4 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("100부터 999까지의 숫자(3자리수)를 입력하시오. (예시: 123) ");
        int num = input.nextInt();
        System.out.println("입력값: " + num);
        int a = num / 100;
        num %= 100;
        int b = num / 10;
        num %= 10;
        int c = num;

        int sum = a + b + c;
        System.out.println("입력한 자릿수의 합은 " + sum);
    }
}

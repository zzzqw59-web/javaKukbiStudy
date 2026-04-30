package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1부터 100까지의 수를 입력하시오.");
        int num = input.nextInt();

        if (num < 1 || num > 100) {
            System.out.println("입력된 값의 범위가 아닙니다.");
        } else {
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
        input.close();
    }
}

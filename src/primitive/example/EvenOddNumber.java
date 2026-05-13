package primitive.example;

import java.util.Scanner;

public class EvenOddNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("숫자 2개를 입력하시오.");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int oddSum = 0;
        int evenSum = 0;

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        input.close();

        System.out.println(start + "부터 " + end + "까지의 홀수의 합: " + oddSum);
        System.out.println(start + "부터 " + end + "까지의 짝수의 합: " + evenSum);

    }
}

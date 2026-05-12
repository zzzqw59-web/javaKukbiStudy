package example;

import java.util.Scanner;

public class ArrayExample1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("1 ~ 10 까지의 수를 입력하시오.");

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }


    }
}

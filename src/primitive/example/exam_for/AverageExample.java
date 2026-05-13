package primitive.example.exam_for;

import java.util.Scanner;

public class AverageExample {
    static void main(String[] args) {
        /*
        10개의 숫자를 입력받아 0보다 큰 숫자에 대한 평균과 갯수를 구하시오
         */

        Scanner input = new Scanner(System.in);
        System.out.println("0보다 큰 숫자 10개를 입력하시오.");

        int count = 0;
        int sum = 0;


        for (int i = 0; i < 10; i++) {
            int inputNumber = input.nextInt();
            while (inputNumber <= 0) {
                System.out.println("0보다 큰 숫자를 입력하시오.");
                inputNumber = input.nextInt();
            }
            sum += inputNumber;
            count++;
        }
        double average = (double) sum / count;
        System.out.println("입력한 숫자의 평균: " + average + ", 입력한 숫자의 갯수: " + count);

    }
}

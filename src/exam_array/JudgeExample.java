package exam_array;

import java.util.Arrays;
import java.util.Scanner;

public class JudgeExample {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("선수 5명의 점수를 입력하시오.");

        int[] values = new int[5];

        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }

        Arrays.sort(values);

        int sum = 0;
        for (int i = 1; i < values.length - 1; i++) {
            sum += values[i];
        }

        double average = (double) sum / values.length;
        System.out.println("최대, 최소를 제외한 남은 인원의 평균: " + average);


    }
}

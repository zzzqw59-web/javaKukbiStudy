package test;

import java.util.Scanner;

public class Example1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("국어, 영어, 수학의 점수를 각각 입력하시오.");
        int koreanCount = input.nextInt();
        int englishCount = input.nextInt();
        int mathCount = input.nextInt();

        int sum = koreanCount + englishCount + mathCount;
        double average = (double) sum / 3;

        System.out.println("세 과목의 총 점수는: " + sum);
        System.out.printf("세 과목의 평균은: %.1f", average);
    }
}

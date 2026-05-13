package primitive.example.exam_while;

import java.util.Scanner;

public class NumberSum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in); // 데이터 입력, 5개

        System.out.println("5개의 정수를 입력하세요.");
        int count = 1;
        int sum = 0;

        System.out.println("[출력예시]");
        while (count <= 5) { // count의 수를 통해서 몇개 입력 받았는지 체크, 특정 값이 정해지지 않았을 때 유용
            int num = input.nextInt();
            System.out.println(count + "번째 수 입력: " + num);
            count++;
            sum += num; // 입력 받은 수의 합
        }

        double average = (double) sum / 5; // 입력 받은 수의 평균

        System.out.println("입력 받은 수");
        System.out.println("합계: " + sum + ", 평균: " + average);

    }
}

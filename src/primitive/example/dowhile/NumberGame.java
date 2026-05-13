package primitive.example.dowhile;

import java.util.Scanner;

public class NumberGame {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = (int) ((Math.random() * 10) + 1);
        int count = 0;

        do {
            System.out.print("1부터 10 사이의 수를 입력하시오. [답은 1~10 사이에 존재] >");
            int inputNumber = input.nextInt();
            count++;

            if (inputNumber > number) {
                System.out.println("입력한 값이 정답보다 더 높습니다.");
            } else if (inputNumber < number) {
                System.out.println("입력한 값이 정답보다 더 낮습니다.");
            }

            if (number == inputNumber) {
                System.out.println("정답입니다.");
                break;
            }

        } while(true);

        System.out.println(count + "번 만에 정답을 맞췄습니다.");
    }
}

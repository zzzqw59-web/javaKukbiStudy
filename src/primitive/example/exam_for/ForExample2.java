package primitive.example.exam_for;

import java.util.Scanner;

public class ForExample2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("정수를 하나 입력하세요: ");
        int num = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;

            if (i == num) {
                System.out.print(i);
            } else {
                System.out.print(i + " + ");
            }
        }
        System.out.println(" = " + sum);
    }
}

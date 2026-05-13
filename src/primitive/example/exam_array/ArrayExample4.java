package primitive.example.exam_array;

import java.util.Scanner;

public class ArrayExample4 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("3 이상의 홀수를 입력하시오.");

        int oddNumber = input.nextInt();

        while (true) {

            if (oddNumber >= 3 || oddNumber % 2 == 1 ) {
                break;
            }

            System.out.println("다시 입력하세요.");
        }

        int middle = oddNumber / 2;

        for (int i = 0; i <= middle; i++) {
            System.out.print((i + 1) + " ");
        }

        for (int i = middle; i >= 0; i--) {
            System.out.print((i + 1) + " ");
        }



    }
}

package primitive.example.dowhile;

import java.util.Scanner;

public class DoWhileExample {
    static void main(String[] args) {
        // 예제1. 선처리 후조건문 확인
        int num = 0;

        do {
            System.out.println("num의 값: " + num);
            num++;
        } while(num < 0);
        System.out.println();

        // 예제2. 1부터 10까지 출력
        int i = 1;

        do {
            System.out.print(i + " ");
            i++;
        } while(i <= 10);
        System.out.println();

        // 예제3. 10부터 1까지 출력
        i = 10;

        do {
            System.out.print(i + " ");
            i--;
        } while (i > 0);
        System.out.println();

        // 예제4. 1부터 100까지 합 출력
        int number = 1;
        int sum = 0;

        do {
            sum += number;
            number++;
        } while (number <= 100);
        System.out.println("1부터 100까지의 합: " + sum);
        System.out.println();

        // 예제5. 사용자에게 문자 혹은 숫자를 입력받아 출력
        // 이때 종료는 "종료"를 입력하면 된다.

        Scanner input = new Scanner(System.in);
        String inputString;
        System.out.println("메세지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 \"종료\"를 입력하세요.");

        do {
            System.out.print(">");
            inputString = input.nextLine();
        } while(!inputString.equals("종료"));

        System.out.println();
        System.out.println("프로그램을 종료합니다.");
        input.close();
    }
}

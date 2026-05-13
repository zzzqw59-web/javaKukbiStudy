package primitive.example.exam_input;

import java.util.Scanner;

public class InputString {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("이름, 나이, 주소를 각각 입력해주세요.");
        String name = input.nextLine();
        int age = input.nextInt();
        input.nextLine();
        /*
        nextInt()는 마지막 개행문자를 제거하지 않음
        따라서, nextLine()으로 개행 문자 없애주기
         */

        String place = input.nextLine();

        System.out.println(name + "님, 안녕하세요! " + age + "살이시네요.");
        System.out.println("주소는 " + place + "이시군요.");

        input.close();
    }
}

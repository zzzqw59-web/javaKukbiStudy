package primitive.example.exam_operation;

import java.util.Scanner;

public class ComparisonOperator {
    static void main(String[] args) {
        int x = 3;
        int y = 4;

        System.out.println("x == y " + (x == y)); // 비교 연산자, 결과값으로 boolean 자료형의 true/false
        System.out.println("x != y " + (x != y));

        System.out.println("x > y " + (x > y));
        System.out.println("x < y " + (x < y));
        System.out.println("x <= y " + (x <= y));
        System.out.println("x >= y " + (x >= y));

        char char1 = 'A';
        char char2 = 'B';

        boolean result = (char1 < char2);
        System.out.println("result = " + result);

        Scanner input = new Scanner(System.in);

        String name1 = "홍길동";

        System.out.println("이름을 입력해주세요.");
        String name2 = input.nextLine();

        if (name1.equals(name2)) {
            System.out.println("이름이 동일합니다.");
        } else {
            System.out.println("이름이 다릅니다.");
        }
    }
}

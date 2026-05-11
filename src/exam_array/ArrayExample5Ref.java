package exam_array;

import java.util.Scanner;

public class ArrayExample5Ref {
    static void main(String[] args) {
        /*
        주민번호 성별자리 이후부터 *로 가려서 출력하시오
        단, 원본 배열의 값은 변경 없이 배열 복사본을 만드시오
        [실행 예시]
        주민등록번호 (-포함): 123456-1234567
        123456 - 1******
        */

        Scanner input = new Scanner(System.in);

        System.out.print("주민번호를 입력하십시오: ");
        String jumin = input.nextLine();

        // 원본 배열
        char[] origin = jumin.toCharArray();

        // 복사본 배열
        char[] copy = origin.clone();

        for (int i = 8; i < copy.length; i++) {
            copy[i] = '#';
        }

        System.out.println(copy);

    }
}

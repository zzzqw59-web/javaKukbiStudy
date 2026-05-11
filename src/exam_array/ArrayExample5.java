package exam_array;

import java.util.Scanner;

public class ArrayExample5 {
    static void main(String[] args) {
        /*
        주민번호 성별자리 이후부터 *로 가려서 출력하시오
        단, 원본 배열의 값은 변경 없이 배열 복사본을 만드시오
        [실행 예시]
        주민등록번호 (-포함): 123456-1234567
        123456 - 1******
        */

        Scanner input = new Scanner(System.in);
        System.out.println("주민번호 앞자리를 입력하시오.");
        int firstResident = input.nextInt();
        System.out.println("주민번호 뒷자리를 입력하시오.");
        int lastResident = input.nextInt();




    }
}

package example;

import java.util.Scanner;

public class ArrayExample1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 1~10까지 숫자의 개수를 저장할 배열
        // index 0 → 숫자 1 개수
        // index 1 → 숫자 2 개수
        // ...
        // index 9 → 숫자 10 개수
        int[] counts = new int[10];

        System.out.print("1 ~ 10 까지의 수를 입력하시오: ");

        // 사용자 입력 한 줄 받기 (예: "1 2 2 3 10")
        String strValue = input.nextLine();

        // 공백 기준으로 문자열 나누기 → 배열로 변환
        String[] strValueArray = strValue.trim().split(" ");

        // 배열을 하나씩 꺼내서 처리
        for (String s : strValueArray) {

            // 문자열 → 정수 변환
            int num = Integer.parseInt(s);

            // 1~10 범위만 처리
            if (num >= 1 && num <= 10) {

                // 핵심: 해당 숫자 위치의 카운트 증가
                // ex) num = 1 → counts[0]++
                // ex) num = 10 → counts[9]++
                counts[num - 1]++;
            }
        }

        System.out.println("\n[집계 결과]");

        // 결과 출력
        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%d의 개수: %d\n", (i + 1), counts[i]);
        }

        input.close();
    }
}
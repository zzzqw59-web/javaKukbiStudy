package test;

import java.util.Scanner;

public class Example2_1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("달걀의 갯수를 입력하시오.");
        int egg = input.nextInt();
        int box = 12;

        int boxCount = ((egg > box) ? (egg / box) : 0);

        System.out.println("달걀 " + egg + "개를 " + box + "개씩 담을 수 있는 상자의 수는 " + boxCount + "개입니다.");




    }
}

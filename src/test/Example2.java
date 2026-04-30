package test;

import java.util.Scanner;

public class Example2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("사탕의 갯수를 입력하시오.");
        int candy = input.nextInt();
        System.out.print("학생 수를 입력하시오.");
        int students = input.nextInt();

        int shareCandy = (candy >= students) ? (candy / students) : 0;
        int lastCandy = (candy >= students) ? (candy % students) : candy;

        System.out.println("각 학생들이 받을 수 있는 사탕의 수: " + shareCandy);
        System.out.println("남는 사탕의 수: " + lastCandy);
    }
}

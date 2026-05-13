package primitive.example;

import java.util.Scanner;

public class TheaterReserve {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] seats = new int[10];

        while (true) {
            System.out.println("---------------------");

            for (int i = 1; i < seats.length + 1; i++) {
                System.out.print(i + " ");
            }

            System.out.println();
            System.out.println("---------------------");

            for (int i = 0; i < seats.length; i++) {   // 배열(참조형) [ 정수 = 0 ]      int[]numbers =  [ int number ]
                System.out.print(seats[i] + " ");
            }

            System.out.println();
            System.out.println("---------------------");

            System.out.println("원하시는 좌석 번호를 입력하세요. (종료는 -1)");
            int seatingNumber = input.nextInt();

            if (seatingNumber == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (seatingNumber < -1 || seatingNumber > 10 || seatingNumber == 0) {
                System.out.println("좌석 번호 선택이 잘못 되었습니다. (1 ~ 10 사이로 입력하세요.)");
            } else if (seats[seatingNumber - 1] == 1) {
                System.out.println("이미 예약된 자리입니다.");
            } else {
                seats[seatingNumber - 1] = 1;
                System.out.println("예약되었습니다.");
            }
        }






    }
}

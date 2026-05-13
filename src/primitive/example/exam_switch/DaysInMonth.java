package primitive.example.exam_switch;

import java.util.Scanner;

public class DaysInMonth {
    static void main(String[] args) {
        int month;
        int year = 2015;
        int days = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("일수를 알고싶은 월을 적으세요.");
        month = input.nextInt();

        if (month >= 1 && month < 13) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;

                case 2:
                    if ((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                default:
                    System.out.println("월을 잘못 입력하셨습니다.");
            }

            System.out.println("해당 " + month + "월의 일수는 " + days + "일 입니다.");
        } else {
            System.out.println("잘못된 월을 입력하셨습니다.");
        }
        input.close();
    }
}

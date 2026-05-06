package exam_if;

import java.util.Scanner;

public class TimePayExample {
    static void main(String[] args) {
        /*
        사용자로 하여금 사원번호, 근무시간, 시간당 금액을 입력받아
        사원번호와 급여를 출력하도록 프로그램을 만들어보세요.
        급여 = 근무시간 * 시간당 금액
        40시간 초과시간만큼 시간당 금액의 50% 추가지급
        */

        Scanner input = new Scanner(System.in);

        System.out.print("사원번호, 근무시간, 급여를 입력하세요.");

        int memberNumber = input.nextInt();
        int workingTime = input.nextInt();
        int perPrice = input.nextInt();
        int salary = workingTime * perPrice;

        if (workingTime > 40) {
            salary += (workingTime - 40) * perPrice / 2;
        }

        System.out.println("사원번호: " + memberNumber + ", 급여: " + salary + "원입니다.");


    }
}

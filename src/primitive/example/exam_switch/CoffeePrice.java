package primitive.example.exam_switch;

import java.util.Scanner;

public class CoffeePrice {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("[메뉴]카푸치노, 카페라떼, 에스프레소, 아이스아메리카노");
        System.out.print("무슨 커피를 드릴까요?");
        String order = input.nextLine();
        String menu = order.trim().replace(" ", "");

        int price = 0;

        switch (menu) {
            case "카푸치노":
            case "카페라떼":
                price = 3500;
                break;
            case "에스프레소":
            case "아이스아메리카노":
                price = 2000;
                break;
            default:
                System.out.println("메뉴에 없습니다.");
        }

        if (price != 0) {
            System.out.println(order + "는 " + price + "원입니다.");
        }
    }
}

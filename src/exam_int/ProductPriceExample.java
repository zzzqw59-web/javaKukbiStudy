package exam_int;

import java.util.Scanner;

public class ProductPriceExample {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("상품 가격을 입력하세요: ");
        int productPrice = input.nextInt();
        System.out.print("구매 수량을 입력하세요: ");
        int quantity = input.nextInt();
        System.out.println("상품 가격: " + productPrice + "원");
        int deliveryFee = 3000;
        System.out.println("구매 수량: " + quantity + "개");
        System.out.println("상품 총 금액: " + (productPrice * 2) + "원");
        System.out.println("배송비: " + deliveryFee + "원");
        System.out.println("최종 결제 금액: " + (productPrice * 2 + deliveryFee) + "원");
    }
}

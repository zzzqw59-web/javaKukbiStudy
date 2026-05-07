package exam_for;

public class ForExample {
    static void main(String[] args) {
        // 예제1. 5번 문장 출력
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ". ");
            System.out.print("Hello World!");
            System.out.println("I love coding");
        }

        System.out.println();

        // 예제2. 1부터 10까지의 합
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1부터 10까지의 합: " + sum);
        System.out.println();

        // 예제3. for문을 이용하여 1~10까지의 정수 중에서 3배 배수의 총합을 구하시오.
        sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("3의 배수의 합: " + sum);
    }
}

package primitive.example.exam_continue;

public class ContinueTest {
    static void main(String[] args) {
        // 1~10까지의 수 중에서 홀수를 출력하도록 continue를 입력해보자.

        int a = 0;

        do {
            a++;
            if (a % 2 == 0) {
                continue;
            }
            System.out.printf("%5d", a);
        } while (a < 10);

        System.out.println();

        // 1~10까지의 수 중에서 짝수를 출력하도록 continue를 만들어보자.
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.printf("%5d", i);
        }
        System.out.println();
    }
}

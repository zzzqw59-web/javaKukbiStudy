package primitive.example.exam_while;

public class WhileExample {
    static void main(String[] args) {
        // [예제] 1부터 5까지 출력
        System.out.println("1부터 5까지 출력");
        int i = 1;
        System.out.println("1. 정수:");
        while(i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        i = 1;
        System.out.println("2. 정수:");
        while(true) { // 조건식이 무조건 참이므로 무한루프(무한반복)
            System.out.print(i + " ");
            i++;

            if (i > 5) { // 반복문을 벗어날 수 있는 조건식을 반드시 명시
                break; // 반복문을 벗어나는 명령문
            }
        }
        System.out.println();

        // [예제2] 5부터 1까지 출력하기
        i = 5;
        System.out.println("1. 정수:");
        while(i > 0) {
            System.out.print(i + " ");
            i--;
        }

        System.out.println();
        i = 5;
        System.out.println("2. 정수:");
        while(true) { // 조건식이 무조건 참이므로 무한루프(무한반복)
            System.out.print(i + " ");
            i--;
            if (i < 1) {
                break;
            }
        }

        System.out.println();
        int num = 1;
        int sum = 0;

        while (num <= 100) {
            sum += num++;
        }
        System.out.println("1부터 100까지의 합: " + sum);

    }
}

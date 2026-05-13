package primitive.example.exam_variable;

public class BooleanExample {
    static void main(String[] args) {
        boolean stop = true;

        // 상태값에 따라 조건문과 제어문의 실행 흐름을 변경하는데 사용
        if (stop) {
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        }

        int x = 10;
        boolean result1 = (x == 20); // false, 변수 x의 값이 20인가?
        boolean result2 = (x != 20); // true, 변수 x의 값이 20이 아닌가?
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}

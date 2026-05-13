package primitive.example.exam_variable;

public class VariableInitExample {
    static void main(String[] args) {
        int value = 10;
        int result = value + 10;

        System.out.println("value = " + value + ", result = " + result);

        // 정수: %d , 문자: %c, 문자열: %s, 실수: %f
        System.out.printf("value=%d\nresult=%d", value, result);
    }
}

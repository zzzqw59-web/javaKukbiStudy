package exam_string;

public class TextBlockExample {
    static void main(String[] args) {
        String str1 = "{\n" +
                "\t\"id\":\"javaUser\",\n" +
                "\t\"name\":\"홍길동\"\n" +
                "}";

        String str2 = """
                {
                    "id": "javaUser",
                    "name": "홍길동"
                }
                """;

        System.out.println(str1);
        System.out.println("========");
        System.out.println(str2);
        System.out.println("========");
        
        // 도중에 \를 넣은 것은 연결의 의미, 붙여도 되지만 가독성을 위해 끊어놓음
        String str = """
                나는 자바를 \
                학습합니다.
                나는 자바 고수가 될 것입니다.
                """;
        System.out.println(str);
    }
}

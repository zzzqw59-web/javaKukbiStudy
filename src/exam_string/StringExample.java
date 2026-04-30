package exam_string;

public class StringExample {
    static void main(String[] args) {
        String name = "김성민";
        String job = "백엔드 프로그래머";
        System.out.println(name);
        System.out.println(job);

        String str = "나는 \'자바\'를 배웁니다.";
        System.out.println(str);

        str = "010-6630-2401\t김성민\t취준생";
        System.out.println(str);

        System.out.print("나는\n");
        System.out.print("자바를\n");
        System.out.print("배웁니다.");

        // 추가예제
        System.out.println("\n이름에서 성만 출력하기");
        String value = "김성민";
        char word = value.charAt(0);
        System.out.println(word);
    }
}

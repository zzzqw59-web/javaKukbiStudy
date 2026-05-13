package primitive.example.exam_for;

public class ForOverlapExample {
    static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " ");
        }

        System.out.println();

        System.out.println("중첩 반복문");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("역순");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println();

        System.out.println("피라미드");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("체크");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= i + 4; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

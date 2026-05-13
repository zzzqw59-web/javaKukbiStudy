package primitive.example.exam_array;

public class CharArrayExample {
    static void main(String[] args) {
        /*
        대문자와 소문자 전체를 출력하도록 코딩하시오.
         */

        char[] spell = new char[52];

        for (int i = 0; i < 26; i++) {
            spell[i] = (char) ('A' + i);
        }

        for (int i = 26; i < 52; i++) {
            spell[i] = (char) ('a' + (i - 26));
        }

        for (char c : spell) {
            System.out.print(c + " ");
        }
    }
}

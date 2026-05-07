package exam_continue;

public class ContinueExample {
    static void main(String[] args) {
        String sentence = "no news is good news";

        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char code = sentence.charAt(i);

            if (code != 'n') {
                continue;
            }
            count++;
        }
        System.out.println("n의 갯수: " + count);
    }
}

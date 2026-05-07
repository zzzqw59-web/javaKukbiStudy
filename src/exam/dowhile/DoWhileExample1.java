package exam.dowhile;

public class DoWhileExample1 {
    static void main(String[] args) {
        char alphabet = 'a';

        do {
            System.out.print(alphabet);
            alphabet++;
            if (alphabet <= 'z') {
                System.out.print(" ");
            }
        } while(alphabet <= 'z');


    }
}

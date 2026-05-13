package primitive.example.exam_for;

public class DiceExample {
    static void main(String[] args) {
        /*
        1,5 > 2,4 > 3,3 > 4,2 > 5,1
         */


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((i + j) != 6) {
                    continue;
                }
                System.out.println(i + "," + j);
            }
        }
    }
}

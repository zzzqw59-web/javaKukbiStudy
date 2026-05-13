package primitive.example.exam_while;

public class WhileExample1 {
    static void main(String[] args) {
        int i = 1;
        int evenSum = 0;

        while (i <= 100) {
            if (i % 2 == 0) {
                evenSum += i;
            }
            i++;
        }
        System.out.println("1부터 100까지 짝수의 합: " + evenSum);

        int j = 1;
        int oddSum = 0;

        while (j <= 100) {
            if (j % 2 == 1) {
                oddSum += j;
            }
            j++;
        }
        System.out.println("1부터 100까지 홀수의 합은: " + oddSum);
    }
}

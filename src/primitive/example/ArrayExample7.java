package primitive.example;

import java.util.Arrays;

public class ArrayExample7 {
    static void main(String[] args) {
        int[] numbers = new int[9];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10 + 1);
        }

        Arrays.sort(numbers);

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            if (i < numbers.length - 1) {
                System.out.print(" + ");
            }
            sum += numbers[i];
        }
        System.out.print(" = " + sum);
    }
}

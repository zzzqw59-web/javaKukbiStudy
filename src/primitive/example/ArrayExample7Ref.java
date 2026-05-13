package primitive.example;

import java.util.Scanner;

public class ArrayExample7Ref {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[9];

        for (int i = 0; i < numbers.length; i++) {
            int random = (int) ((Math.random() * 10) + 1);
            numbers[i] = random;
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + " + ");
            }
            sum += numbers[i];
        }
        System.out.println(" = " + sum);
    }
}

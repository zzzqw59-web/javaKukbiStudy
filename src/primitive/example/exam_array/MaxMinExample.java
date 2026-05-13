package primitive.example.exam_array;

public class MaxMinExample {
    static void main(String[] args) {
        /*
        최댓값, 최소값을 각각 출력하시오.
         */

        int[] numbers = {12, 26, 68, 98, 76, 54, 8, 6, 4};

        int maxNumber = numbers[0];
        int minNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            maxNumber = Math.max(maxNumber, numbers[i]);
            minNumber = Math.min(minNumber, numbers[i]);

//            if (numbers[i] > maxNumber) {
//                maxNumber = numbers[i];
//            }
//
//            if (numbers[i] < minNumber) {
//                minNumber = numbers[i];
//            }
        }
        System.out.println("최대값: " + maxNumber);
        System.out.println("최소값: " + minNumber);
    }
}

package primitive.example.exam_array;

public class ArrayExample1 {
    static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        /*
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
         */

        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[1] = " + numbers[1]);
        System.out.println("numbers[2] = " + numbers[2]);
        System.out.println();

        for (int number : numbers) {
            System.out.println(number);
        }

        double[] arrayDouble = new double[2];

        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.println("arrayDouble[" + i + "]" + arrayDouble[i]);
        }
        System.out.println();

        // String[] arrayString = new String[]{"java", "oracle", "springboot");
        String[] arrayString = new String[3];
        arrayString[0] = "java";
        arrayString[1] = "oracle";
        arrayString[2] = "springboot";

        for (String s : arrayString) {
            System.out.println(s);
        }

        for (int i = 0; i < arrayString.length; i++) {
            System.out.println("arrayString[" + i + "]" + arrayString[i]);
        }
    }
}

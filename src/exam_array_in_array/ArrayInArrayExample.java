package exam_array_in_array;

public class ArrayInArrayExample {
    static void main(String[] args) {
        // 예제1
        int[][] arr1 = new int[2][3];

        System.out.println("arr1.length = " + arr1.length);
        System.out.println("arr1[0].length = " + arr1[0].length);
        System.out.println("arr1[1].length = " + arr1[1].length);
        System.out.println();

        for (int i = 0; i < arr1.length; i++) { // 행의 요소
            for (int k = 0; k < arr1[i].length; k++) { // 열의 요소
                System.out.println("arr1[" + i + "][" + k + "] = " + arr1[i][k] + " ");
            }
            System.out.println();
        }

        // 예제2
        int[][] arr2 = new int[][] {{10, 20, 30}, {40, 50, 60}};
        // int arr2[][] = {{10, 20, 30}, {40, 50, 60}};

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("%-5d", arr2[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // 예제3
        int[][] arr3 = new int[2][];
        arr3[0] = new int[] {1, 5};
        arr3[1] = new int[3];

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println("arr3[" + i + "][" + j + "] = " + arr3[i][j] + " ");
            }
            System.out.println();
        }

        // 예제4
        int[][] array = new int[5][5];
        int num = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = num++;
            }
        }

        for (int i = 0; i< array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%-5d", array[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("합계: " + sum);
        System.out.println();

        // 예제 5
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%-5d", array[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }
}

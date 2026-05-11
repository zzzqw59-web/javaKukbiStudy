package example;

import java.util.Scanner;

public class ArrayExample3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== 성적 분포 그래프 =====");
        int[] students = {90, 20, 50, 70, 65, 90, 100, 43, 55, 87};

        for (int student : students) {
            System.out.print(student + "점 | ");

            int barCount = student / 10;

            for (int i = 0; i < barCount; i++) {
                System.out.print("■ ");
            }
            System.out.println();
        }
        System.out.println("=========================");


    }
}

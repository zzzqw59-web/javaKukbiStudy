package example;

public class GradesProgramming {
    static void main(String[] args) {
        String[] name = {"홍길동", "김철수", "이진희"};
        int[][] scores = {
                {90, 75, 61},
                {55, 56, 46},
                {90, 90, 90}
        };


        System.out.println("              성적 프로그램");
        System.out.println("=========================================");
        System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t재수강 순위");
        System.out.println("=========================================");


        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            System.out.print((i + 1) + " ");
            System.out.print(name[i] + " ");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
                sum += scores[i][j];
            }

            double avg = (double) sum / scores[i].length;
            System.out.print(sum + " ");
            System.out.printf("%.2f", avg);


            if (avg >= 90) {
                System.out.print(" " + "A");
                System.out.print(" " + "pass");
            } else if (avg >= 80) {
                System.out.print(" " + "B");
                System.out.print(" " + "pass");
            } else if (avg >= 70) {
                System.out.print(" " + "C");
                System.out.print(" " + "pass");
            } else if (avg >= 60) {
                System.out.print(" " + "D");
                System.out.print(" " + "pass");
            } else {
                System.out.print(" " + "F");
                System.out.print(" " + "nopass");
            }

            for (int k = 0; k < scores.length; k++) {
            }



            System.out.println();

        }




    }
}

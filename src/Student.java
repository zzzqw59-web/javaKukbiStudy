public class Student {
    private String name;
    private int score;
    private static int totalStudentCount;
    private static int totalScoreSum;

    Student(String name, int score) {
        this.name = name;
        this.score = score;

        totalStudentCount++;
        totalScoreSum += score;
    }

    public static void showTotalStudents() {
        System.out.println("전체 학생 수: " + totalStudentCount);
    }

    public static void showAverageScore() {
        double average = (double) totalScoreSum / totalStudentCount;
        System.out.println("평균 점수: " + average);
    }

}

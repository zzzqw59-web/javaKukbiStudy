public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Kim", 80);
        Student student2 = new Student("Lee", 90);
        Student student3 = new Student("Park", 70);

        Student.showTotalStudents();
        Student.showAverageScore();
    }
}

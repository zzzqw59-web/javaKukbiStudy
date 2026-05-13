package primitive.example.exam_variable;

public class User {
    private String userName;
    private int userAge;
    private int userGrade;

    public User(String userName, int userAge, int userGrade) {
        this.userName = userName;
        this.userAge = userAge;
        this.userGrade = userGrade;

    }

    public void printUser() {
        if (userAge >= 20) {
            System.out.println("이름: " + userName + ", 나이: " + userAge + ", 성적: " + userGrade);
        }
    }


}

package primitive.example.exam_variable;

public class UserMain {
    static void main(String[] args) {
        User user1 = new User("철수", 15, 20);
        User user2 = new User("영희", 18, 30);
        User user3 = new User("민재", 20, 15);
        User user4 = new User("민철", 30, 18);
        User user5 = new User("철이", 25, 32);

        User[] users = new User[5];
        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        users[3] = user4;
        users[4] = user5;

        for (User user : users) {
            user.printUser();
        }

    }
}

package primitive.example.dowhile;

public class RandomExample {
    static void main(String[] args) {
        System.out.println(Math.random()); // 랜덤 소수점 난수

        System.out.println((int) (Math.random() * 10)); // 0~9까지 정수 출력
        System.out.println((int) (Math.random() * 10) + 1); // 1~10까지 정수 출력

        int num = (int)(Math.random() * 6) + 1;
        System.out.println("주사위: " + num);
    }
}

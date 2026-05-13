package primitive.example.exam_array;

public class CardExample {
    static void main(String[] args) {
        String[] shapes = {"Clubs", "Diamond", "Hearts", "Spades"};
        String[] nums = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int randomShapes = (int) ((Math.random() * 4));
        int randomNums = (int) ((Math.random() * 13));

        System.out.println(shapes[randomShapes] + "의 " + nums[randomNums]);

    }
}

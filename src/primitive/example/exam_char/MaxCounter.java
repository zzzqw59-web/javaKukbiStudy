package primitive.example.exam_char;

public class MaxCounter {
    private int count = 0;
    private int max;

    MaxCounter(int max) {
        this.max = max;
    }

    public void increament() {
        if (count < max) {
            count++;
        } else {
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }

    public int getCount() {
        return count;
    }
}

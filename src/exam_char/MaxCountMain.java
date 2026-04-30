package exam_char;

public class MaxCountMain {
    static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3);

        counter.increament();
        counter.increament();
        counter.increament();
        counter.increament();
        int count = counter.getCount();
        System.out.println(count);
    }
}

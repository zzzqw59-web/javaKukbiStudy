package final1;

public class FinalRefMain {
    static void main(String[] args) {
        final Data data = new Data();

        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}

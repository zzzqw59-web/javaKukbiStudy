package primitive.example.exam_variable;

public class Test {
    static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int temp;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println();

        temp = num2; // temp = 20;
        num2 = num1; // num2 = 10;
        num1 = temp; // num1 = 20;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}

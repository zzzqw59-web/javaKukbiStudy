package exam_variable;

public class VariableExchangeExample {
    static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int temp;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println();

        temp = num2; // temp = 2
        num2 = num1; // num2 = 1
        num1 = temp; // num1 = 2

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        char a = 65;
        System.out.println("a = " + a);
    }
}

package exam_main_argument;

public class MainStringArrayArgument {
    static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("현재 프로그램을 실행하기 위해서는 반드시 실행 시");
            System.out.println("두개의 숫자를 입력해주셔야 합니다.");
            System.exit(1); // 프로그램을 종료. exit(숫자)
        }

        String strNum1 = args[0]; // "2"
        String strNum2 = args[1]; // "5"

        // 문자 => 숫자
        int num1 = Integer.parseInt(strNum1); // 2
        int num2 = Integer.parseInt(strNum2); // 5

        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}

// exam_main_argument.MainStringArrayArgument

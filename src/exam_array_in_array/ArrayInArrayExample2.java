package exam_array_in_array;

public class ArrayInArrayExample2 {
    static void main(String[] args) {
        int count = 0;
        String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "김철수", "홍길동", "배혜진"};
        String[][] seat1 = new String[3][2];
        String[][] seat2 = new String[3][2];

        // 배열에 데이터 대입(저장)
        for (int i = 0; i < seat1.length; i++) {
            for (int j = 0; j < seat1[i].length; j++) {
                seat1[i][j] = students[count++];
            }
        }

        for (int i = 0; i < seat2.length; i++) {
            for (int j = 0; j < seat2[i].length; j++) {
                seat2[i][j] = students[count++];
            }
        }

        // 데이터 출력
        System.out.println("== 1분단 ==");
        for (int i = 0; i < seat1.length; i++) {
            for(int j = 0; j < seat1[i].length; j++) {
                System.out.print(seat1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("== 2분단 ==");
        for (int i = 0; i < seat2.length; i++) {
            for (int j = 0; j < seat2[i].length; j++) {
                System.out.print(seat2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

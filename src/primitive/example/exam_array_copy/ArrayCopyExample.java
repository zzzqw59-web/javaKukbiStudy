package primitive.example.exam_array_copy;

import java.util.Arrays;

public class ArrayCopyExample {
    static void main(String[] args) {
        // 예제 1
        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i]);

            if (i < newStrArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println(Arrays.toString(newStrArray));

    }
}

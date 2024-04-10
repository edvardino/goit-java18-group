package global.goit;

import java.util.Arrays;

/**
 * В класі наведений приклад як поміняти місцями два
 * елементи масиву. Така операція англійською
 * називається "swap".
 */
public class SwapArrayElementsExample {

    public static void main(String[] args) {

        // поміняємо місцями в цьому списку 1й і 4й елементи
        int[] temperatures = {34, 23, 54, -23, 0, -2};

        System.out.println("Original array: " + Arrays.toString(temperatures));

        int tempValue = temperatures[1];
        temperatures[1] = temperatures[4];
        temperatures[4] = tempValue;

        System.out.println("Modified array: " + Arrays.toString(temperatures));

    }

}

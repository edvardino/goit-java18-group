package global.goit;

import java.util.Arrays;

public class SortArrayExample {

    public static void main(String[] args) {
        int[] integerArray = {11, -23, 34, 0, -3};

        System.out.println("Initial array: " + Arrays.toString(integerArray));

        Arrays.sort(integerArray);

        System.out.println("Sorted array: " + Arrays.toString(integerArray));

    }

}

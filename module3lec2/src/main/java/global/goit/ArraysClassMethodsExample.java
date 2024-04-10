package global.goit;

import java.util.Arrays;

public class ArraysClassMethodsExample {

    // e d f j a c b
    public static void main(String[] args) {

        sort(args);

        deepToString();

        copyOf(args);

        copyOfRange(args);

        equals(args);

        fill();

        mismatch();

        binarySearch(args);

//        ці методи ми розглянемо пізніше в курсі (вони вимагають ширших знань)
//        Arrays.asList(args);
//        Arrays.hashCode(args);
//        Arrays.stream();

    }

    public static void sort(String[] array) {
        System.out.println("Original array: " + Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void deepToString() {

        int[][] matrix = new int[][] {
                {1, 3, 5},
                {5, 4, 2}
        };

        System.out.println(Arrays.deepToString(matrix));
    }

    public static void copyOf(String[] array) {
        System.out.println("Original array:\t" + Arrays.toString(array));

        String[] copiedArray = Arrays.copyOf(array, array.length);

        System.out.println("Copied array:\t" + Arrays.toString(copiedArray));
    }

    public static void copyOfRange(String[] array) {
        System.out.println("Original array: " + Arrays.toString(array));

        String[] range = Arrays.copyOfRange(array, 2, 4);

        System.out.println("Range 2-4 from array: " + Arrays.toString(range));
    }

    public static void equals(String[] array) {
        String[] anotherArray = Arrays.copyOf(array, array.length);

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Array to compare: " + Arrays.toString(anotherArray));

        boolean arraysEqual = Arrays.equals(array, anotherArray);

        System.out.println("These 2 arrays are identical: " + arraysEqual);
    }

    public static void fill() {
        String[] lines = new String[10];

        Arrays.fill(lines, "rt");

        System.out.println("Filled array: " + Arrays.toString(lines));


        String[][] multiDimensional = new String[2][3];

        Arrays.fill(multiDimensional, new String[] {"rt1", "rt2", "er"});

        System.out.println("Filled multidimensional array: " + Arrays.deepToString(multiDimensional));
    }

    public static void mismatch() {
        long[] array1 = {12, 4, -4, 5};
        long[] array2 = {12, 4, -4, 5};

        System.out.println("First array: " + Arrays.toString(array1));
        System.out.println("Second array: " + Arrays.toString(array2));

        int mismatchIndex = Arrays.mismatch(array1, array2);

        System.out.println("Mismatch index: " + mismatchIndex);
    }

    public static void binarySearch(String[] array) {
        System.out.println("Original array: " + Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));

        int index = Arrays.binarySearch(array, "bb");

        System.out.println("Found index: " + index);

        var elementUnderIndex = index >= 0 ? array[index] : "Element not exist";

        System.out.println("Element under that index: " + elementUnderIndex);
    }
}

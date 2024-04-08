package global.goit;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {

        int[] integerArray = {11, 43, 45};
        int integerArrayV2[] = {11, 43, 45};

        System.out.println("integerArray: " + integerArray);
        System.out.println("integerArray toString(): " + integerArray.toString());
        System.out.println("integerArray: " + Arrays.toString(integerArray));
        System.out.println("integerArrayV2: " + Arrays.toString(integerArrayV2));

        System.out.println("integerArray size: " + integerArray.length);
        System.out.println("integerArray [0]: " + integerArray[0]);
        System.out.println("integerArray [1]: " + integerArray[1]);
        System.out.println("integerArray [2]: " + integerArray[2]);

        // при зазначенні неіснуючого індексу отримаємо помилку і програма "впаде"
//        System.out.println("integerArray [3]: " + integerArray[3]);
//        System.out.println("integerArray [-1]: " + integerArray[-1]);
    }

}

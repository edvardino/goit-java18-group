package global.goit;

public class MathClassMethodsExample {

    public static void main(String[] args) {

        // повертає абсолютне число
        int abs = Math.abs(-17);
        int abs2 = Math.abs(13);
        System.out.println("Original values: -17, 13");
        System.out.println("Absolute values: " + abs + ", " + abs2);
        System.out.println();


        // повертає округлене за правилами математики число
        long round = Math.round(23.43);
        System.out.println("Rounded 23.43 is " + round);
        round = Math.round(23.50);
        System.out.println("Rounded 23.50 is " + round);
        System.out.println();


        // додає числа і видає помилку у разі виходу за виходу за межі
        int sum = Math.addExact(22, 12);
        System.out.println("AddExact 22 and 12 = " + sum);
        System.out.println();


        // перевіряє чи належить число заданому діапазону і повертає його, якщо належить
        // повертає вказане мінімальне число, якщо бажане число менше мінімального
        // повертає вказане максимальне число, якщо бажане число більше максимального
        int value = 12;
        int min = 3;
        int max = 23;
        int clamped = Math.clamp(value, min, max);
        System.out.printf("Original value %d, min: %d, max: %d, clamped value: %d%n%n",
                value, min, max, clamped);


        // повертає більше з-поміж чисел
        int maximum = Math.max(34, 65);
        System.out.println("Maximum for 34, 65 is " + maximum);


        // повертає менше з-поміж чисел
        int minimum = Math.min(34, 65);
        System.out.println("Minimum for 34, 65 is " + minimum + "\n");


        // зведення в ступінь
        double pow = Math.pow(2, 3);
        System.out.println("2 in power of 3 = " + pow + "\n");


        // випадкове число
        double random = Math.random();
        System.out.println("Random value: " + random + "\n");


        System.out.println("PI = " + Math.PI);
        System.out.println("E = " + Math.E);
        System.out.println("TAU = " + Math.TAU + "\n");


        // десятковий логарифм числа
        double log10 = Math.log10(100);
        System.out.println("Log10(100) = " + log10 + "\n");


        System.out.println("Floor of 23.56 = " + Math.floor(23.56));
        System.out.println("Ceil of 23.43 = " + Math.ceil(23.43));


        // Є багато тригонометричних методів
//        Math.sin()
//        Math.cos()
//        Math.tan()
//        Math.acos()
//        ...
    }

}

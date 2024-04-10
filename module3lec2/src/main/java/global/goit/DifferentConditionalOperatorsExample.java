package global.goit;

import java.util.Scanner;

public class DifferentConditionalOperatorsExample {

    public static void main(String[] args) {

        // гра вгадай число

        Scanner scanner = new Scanner(System.in);
        byte guess = scanner.nextByte();

        if (guess == 2) {
            System.out.println("Вірно!");
        } else {
            System.out.println("Іншим разом вийде.");
        }


        switch (guess) {
            case 2 -> System.out.println("Вірно!");
            default -> System.out.println("Іншим разом вийде.");
        }


        String message = guess == 2 ? "Вірно!" : "Іншим разом вийде.";
        System.out.println(message);

    }
}

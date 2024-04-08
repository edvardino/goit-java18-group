package global.goit;

import java.util.Scanner;

public class ConsoleInputExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String textValue = scanner.nextLine();
        System.out.println("You entered: " + textValue);
        System.out.print("Enter integer value: ");
        int intValue = scanner.nextInt();
        System.out.println("You entered: " + intValue);
        System.out.print("Enter float value: ");
        float floatValue = scanner.nextFloat();
        System.out.println("You entered: " + floatValue);

        System.out.println();
        var textToParse = "text 123.23";
        System.out.printf("Predefined text to be parsed: %s%n", textToParse);
        Scanner predefinedData = new Scanner(textToParse);
        if (predefinedData.hasNext()) {
            System.out.printf("Scanner has next: %s%n", predefinedData.next());
        }
        if (predefinedData.hasNextFloat()) {
            System.out.printf("Scanner has next float: %s%n", predefinedData.nextFloat());
        }
    }

}

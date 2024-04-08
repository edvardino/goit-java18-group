package global.goit;

import java.util.Date;

public class ConsoleOutputExample {

    public static void main(String[] args) {
        // виводить дані в консоль і переводить курсор на наступний рядок
        System.out.println("Hello Java ");
        // слово "Learners!" буде виведено на окремому рядку
        System.out.println("Learners!");

        // порожній рядок з переводом курсора на наступний рядок
        System.out.println();

        // метод print не переводить курсор на наступний рядок
        System.out.print("Some text ");
        System.out.println("that was not split onto two lines");


        // спецсимволи в рядку
        // \n перенос курсора на наступний рядок
        System.out.println("Hello\n world!");
        // \t недрукований символ табуляції
        System.out.println("Hello\tworld!");
        System.out.println("\n");

        // форматування рядка
        var groupName = "Java18";
        int totalNumberOfStudent = 74;
        double studentsTurnOutPercents = 60.00;
        float studentsReadyForClassAmongPresentPercents = 88.88F;
        // %s - для заміни рядком
        System.out.printf("Group name is '%s'\n", groupName);
        // %d десяткове число
        System.out.printf("%d students in the group\n", totalNumberOfStudent);
        System.out.printf("%f %% of students are present today\n", studentsTurnOutPercents);
        System.out.printf("%.2f %% of students are present today\n", studentsTurnOutPercents);
        System.out.printf("%f %% students ready for today's class\n", studentsReadyForClassAmongPresentPercents);
        System.out.printf("%.1f %% students ready for today's class\n", studentsReadyForClassAmongPresentPercents);

        System.out.println("\n");
        System.out.println("Example of formatting for value 1234567890");
        System.out.printf("------------------------------%n");
        System.out.printf("| %-8s | %-15s |%n", "Pattern", "Result");
        System.out.printf("------------------------------%n");
        System.out.printf("| %-8s | %d |%n", "%d", 1234567890);
        System.out.printf("| %-8s | %,d |%n", "%,d", 1234567890);
        System.out.printf("| %-8s | %,15d |%n", "%,15d", 1234567890);
        System.out.printf("| %-8s | %+,15d |%n", "%+,15d", 1234567890);
        System.out.printf("| %-8s | %-+,15d |%n", "%-+,15d", 1234567890);
        System.out.printf("| %-8s | %0,15d |%n", "%0,15d", 1234567890);

        System.out.println("\n");
        var now = new Date();
//        var now = LocalDateTime.now();
        System.out.println("Current time: " + now);
        System.out.printf("Current time: %tHh %tMm %tSs %tp (%tsms) %tz %tA\n", now, now, now, now, now, now, now);
    }

}
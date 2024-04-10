package global.goit;

import java.util.Scanner;

public class SwitchCaseExample {

    public static void main(String[] args) {

        String guestRoom = "Room-";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you room number: ");
        int roomNumber = scanner.nextInt();

        guestRoom += roomNumber;

        String level = switch (guestRoom) {
            case "Room-11", "Room-12", "Room-13" -> "1st";
            case "Room-22", "Room-23" -> "2nd";
            case "Room-31" -> "3nd";
            default -> null;
        };

        if (level != null) {
            System.out.printf("Your room is on %s level", level);
        } else {
            System.out.println("Unknown room, do not know where it is located.");
        }
    }

}

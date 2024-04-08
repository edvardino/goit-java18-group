package global.goit;

public class ForLoopExample {

    public static void main(String[] args) {

        int [] values = {12, 45, 124, 45, 0, -1, -45, -45, 23};

        System.out.print("You array: ");
        for (int value : values) {
            System.out.print(value + " ");
        }

        System.out.println("\n");

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

    }

}

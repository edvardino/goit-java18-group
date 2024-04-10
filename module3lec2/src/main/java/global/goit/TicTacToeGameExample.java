package global.goit;

import java.util.Scanner;

public class TicTacToeGameExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte rowIndex;
        byte columnIndex;

        String[][] board = {
                {"", "", ""},
                {"", "", ""},
                {"", "", ""}
        };

        printBoard(board);

        System.out.print("Гравець 1: ");
        rowIndex = scanner.nextByte();
        columnIndex = scanner.nextByte();

        board[rowIndex][columnIndex] = "X";

        printBoard(board);

        System.out.print("Гравець 2: ");
        rowIndex = scanner.nextByte();
        columnIndex = scanner.nextByte();

        board[rowIndex][columnIndex] = "O";

        printBoard(board);


        System.out.print("Гравець 1: ");
        rowIndex = scanner.nextByte();
        columnIndex = scanner.nextByte();

        board[rowIndex][columnIndex] = "X";

        printBoard(board);

        System.out.print("Гравець 2: ");
        rowIndex = scanner.nextByte();
        columnIndex = scanner.nextByte();

        board[rowIndex][columnIndex] = "O";

        printBoard(board);


        System.out.print("Гравець 1: ");
        rowIndex = scanner.nextByte();
        columnIndex = scanner.nextByte();

        board[rowIndex][columnIndex] = "X";

        printBoard(board);

        System.out.print("Гравець 2: ");
        rowIndex = scanner.nextByte();
        columnIndex = scanner.nextByte();

        board[rowIndex][columnIndex] = "O";

        printBoard(board);


        System.out.print("Гравець 1: ");
        rowIndex = scanner.nextByte();
        columnIndex = scanner.nextByte();

        board[rowIndex][columnIndex] = "X";

        printBoard(board);

        System.out.print("Гравець 2: ");
        rowIndex = scanner.nextByte();
        columnIndex = scanner.nextByte();

        board[rowIndex][columnIndex] = "O";

        printBoard(board);


        System.out.print("Гравець 1: ");
        rowIndex = scanner.nextByte();
        columnIndex = scanner.nextByte();

        board[rowIndex][columnIndex] = "X";

        printBoard(board);

        // todo додати виведення переможця
    }

    public static void printBoard(String[][] board) {
        System.out.println("\t" + board[0][0] + "\t|\t" + board[0][1] + "\t|\t" + board[0][2]);
        System.out.println("\t" + board[1][0] + "\t|\t" + board[1][1] + "\t|\t" + board[1][2]);
        System.out.println("\t" + board[2][0] + "\t|\t" + board[2][1] + "\t|\t" + board[2][2]);
    }

}

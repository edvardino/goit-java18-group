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
        //X starts the game
        char[] players = {'X','O'};
        int whoseStep = 0;
        char player;
        do {
            player = players[whoseStep % 2];
            do {
                System.out.print("Гравець " + player + ": ");
                rowIndex = scanner.nextByte();
                columnIndex = scanner.nextByte();
            } while (!isValid(board, rowIndex, columnIndex));
            board[rowIndex][columnIndex] = String.valueOf(player);
            printBoard(board);
            whoseStep++;
        } while (!isFinishedByPlayer(board, player));
    }

    private static boolean isValid(String[][] board, byte rowIndex, byte columnIndex) {
        if (rowIndex < 0 || rowIndex > board.length - 1) {
            System.out.println("Incorrect coordinates. Row must be in range of 0 to " + (board.length - 1));
            return false;
        }
        if (columnIndex < 0 || columnIndex > board[rowIndex].length - 1) {
            System.out.println("Incorrect coordinates. Column must be in range of 0 to " + (board[rowIndex].length - 1));
            return false;
        }
        if (!board[rowIndex][columnIndex].isBlank()) {
            System.out.println("These coordinates are already in use!");
            return false;
        }
        return true;
    }

    public static void printBoard(String[][] board) {
        System.out.println("\t" + board[0][0] + "\t|\t" + board[0][1] + "\t|\t" + board[0][2]);
        System.out.println("\t" + board[1][0] + "\t|\t" + board[1][1] + "\t|\t" + board[1][2]);
        System.out.println("\t" + board[2][0] + "\t|\t" + board[2][1] + "\t|\t" + board[2][2]);
    }
    private static boolean isFinishedByPlayer(String[][] array, char player) {
        //check lines
        int cnt = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].isBlank() || array[i][j].charAt(0) != player) {
                    cnt = 0;
                    break;
                }
                cnt++;
            }
            if (cnt == 3) {
                System.out.println("Player " + player + " won the game!");
                return true;
            }
            cnt = 0;
        }
        //check columns
        cnt = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j][i].isBlank() || array[j][i].charAt(0) != player) {
                    cnt = 0;
                    break;
                }
                cnt++;
            }
            if (cnt == 3) {
                System.out.println("Player " + player + " won the game!");
                return true;
            }
            cnt = 0;
        }
        //check diagonals
        cnt = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][i].isBlank() || array[i][i].charAt(0) != player) {
                cnt = 0;
                break;
            }
            cnt++;
        }
        if (cnt == 3) {
            System.out.println("Player " + player + " won the game!");
            return true;
        }
        cnt = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][array.length - i - 1].isBlank() || array[i][array.length - i - 1].charAt(0) != player) {
                cnt = 0;
                break;
            }
            cnt++;
        }
        if (cnt == 3) {
            System.out.println("Player " + player + " won the game!");
            return true;
        }
        //check the place for the next step
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].isBlank())
                    return false;
            }
        }
        System.out.println("The game is over. Nobody wins.");
        return true;
    }
}

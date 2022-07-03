package uz.pdp;

import java.util.Scanner;

public class Robot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte[][] table = new byte[7][7];
        System.out.println("1 qiymatini joylashitirish o'rnini kiriting!");

        byte rowNumber = -1, colNumber = -1;

        do {
            System.out.printf("qator raqami (1..%d): ", table.length);
            rowNumber = scanner.nextByte();
        } while (rowNumber < 1 || rowNumber > table.length);

        do {
            System.out.printf("ustun raqami (1..%d): ", table.length);
            colNumber = scanner.nextByte();
        } while (colNumber < 1 || colNumber > table.length);

        rowNumber--;
        colNumber--;

        byte centerX = (byte) (table.length / 2), centerY = centerX;

        byte result = (byte)(Math.abs(rowNumber-centerX)+Math.abs(colNumber-centerY));
        System.out.println("Natija: "+result);

    }
}

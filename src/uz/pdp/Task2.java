package uz.pdp;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;

        do {
            System.out.print("n ni kiriting (1..1018): ");
            n = scanner.nextInt();
        } while (n < 1 || n > 1018);

        System.out.println("Natija: "+ (n < 5 ? 0 : 1));

    }
}

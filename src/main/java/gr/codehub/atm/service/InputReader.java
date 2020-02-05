package gr.codehub.atm.service;

import java.util.Scanner;

public class InputReader {

    private Scanner scanner;

    public InputReader() {
        scanner = new Scanner(System.in);
    }

    public int getIntInput() {
        try {
            return scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not a number - treating as zero");
            scanner.nextLine();
            return 0;
        }
    }

    public double getDoubleInput() {
        try {
            return scanner.nextDouble();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not a number - treating as zero");
            scanner.nextLine();
            return 0.0;
        }
    }
}

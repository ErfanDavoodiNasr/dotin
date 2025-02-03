package ir.dotin;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("enter a number: ");
        long enteredNumber = scanner.nextLong(); // get input number

        if ((enteredNumber % 2) == 0) {
            System.out.println(enteredNumber + " is even");
        } else {
            System.out.println(enteredNumber + " is odd");
        }
    }
}




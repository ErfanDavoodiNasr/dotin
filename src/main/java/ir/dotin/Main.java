package ir.dotin;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("enter first number: ");
        long firstNumber = scanner.nextLong(); // get input number

        System.out.print("enter second number: ");
        long secondNumber = scanner.nextLong(); // get input number

        if (firstNumber > secondNumber){
            System.out.println("first number is greater than second number");
        }else if (secondNumber > firstNumber){
            System.out.println("second number is greater than first number");
        }else {
            System.out.println("both numbers are equal");
        }
    }
}




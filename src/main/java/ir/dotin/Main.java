package ir.dotin;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double TAX_RATE = 0.1; // for example tax rate is 10%

        System.out.print("enter your income: ");
        double income = scanner.nextDouble(); // get input income from user
        double incomeTax = income * TAX_RATE; // calculate income tax
        System.out.println("income tax for " + income + "$ is: " + incomeTax);
    }
}




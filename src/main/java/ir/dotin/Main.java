package ir.dotin;


public class Main {
    public static void main(String[] args) {
        String firstName = "Erfan ";
        String lastName = "Davoodi Nasr";

        //String fullName = firstName.concat(lastName); // concat firstName and lastName
        String fullName = firstName + lastName; // concat firstName and lastName

        //System.out.println("My name is: ".concat(fullName)); // print full name
        System.out.println("My name is: " + fullName); // print full name
        System.out.println("Length of my name is: " + fullName.length() + "characters"); // get fullName length
        System.out.println("My first name start with: " + fullName.charAt(0)); // first char of my full name
        System.out.println("My first name end with: " + fullName.charAt(fullName.length()-1)); // last char of my full name
    }
}
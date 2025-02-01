package ir.dotin;

public class Main {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 25.5;
        double c = 10.5;
        System.out.printf("""
                a > b : %s
                a < c : %s
                a <= c + b : %s
                b != c + a : %s
                b >= a + c : %s
                a == c : %s
                """, a > b, a < c, a <= c + b, b != c + a, b >= a + c, a == c);

    }
}




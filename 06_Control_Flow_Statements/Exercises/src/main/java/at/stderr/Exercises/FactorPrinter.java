package at.stderr.Exercises;

public class FactorPrinter {

    public static void main(String[] args) {
        printFactors(6);
    }

    public static void printFactors(int n) {
        if ( n < 1) {
            System.out.println("Invalid Value");
            return;
        }

        for(int i=1; i <= n; i++) {
            if ( n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

package at.stderr.Exercises;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(8);
    }
    public static void printSquareStar(int n) {
        if (n < 5) {
            System.out.printf("Invalid Value");
            return;
        }

        for( int r = 0; r < n; r++) {
            for( int c = 0; c < n; c++) {
                if (r == 0 || r == n-1 || c == 0 || c == n-1 || r == c || c == (n - (r+1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

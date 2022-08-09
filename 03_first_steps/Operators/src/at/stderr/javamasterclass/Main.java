package at.stderr.javamasterclass;

public class Main {
    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result); // 4

        result = result % 3;
        System.out.println("4 % 3 = " + result); // 1

        // result = result + 1;
        result++; // 2
        System.out.println("1 + 1 = " + result); // 2

        result--;
        System.out.println("1 - 1 = " + result); // 1

        // result = result +2;
        result += 2;
        System.out.println("1 + 2 = " + result); // 3

        // result = result * 10;
        result *= 10;
        System.out.println("3 * 10 = " + result); // 30

        // result = result / 3
        result /= 3;
        System.out.println("30 / 3 = " + result); // 10

        // result = result - 2
        result -= 2;
        System.out.println("10 - 2 = " + result); // 8

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And i am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }
    }
}
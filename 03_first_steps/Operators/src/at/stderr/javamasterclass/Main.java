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

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // Challange
        double firstDouble = 20d;
        double secondDouble = 80d;
        double stepThreeResult = (firstDouble + secondDouble) * 100d;
        System.out.println("stepThreeResult: " + stepThreeResult);
        double remainder = stepThreeResult % 40d;
        System.out.println("remainder: " + remainder);
        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println("isZero: " + isNoRemainder);
        if(!isNoRemainder) {
            System.out.printf("Got a remainder");
        }
    }
}

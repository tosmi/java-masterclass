package at.stderr.Methods;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " + highScore);

        int position = calculateHighScorePosition(1001);
        displayHighScore("Toni", position);

        position = calculateHighScorePosition(888);
        displayHighScore("Elke", position);

        position = calculateHighScorePosition(300);
        displayHighScore("Franz", position);

        position = calculateHighScorePosition(50);
        displayHighScore("Kurt", position);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    public static int calculateHighScorePosition(int score) {
        // Bad example, better solution see below
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;

        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100); {
            position = 3;
        }

        return position;
    }

    public static void displayHighScore(String playerName, int position) {
        System.out.println(playerName + " managed to get position " + position + " on the high score table");
    }



}

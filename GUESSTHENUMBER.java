import java.util.Random;
import java.util.Scanner;

public class GUESSTHENUMBER {
    private static final int minRange = 1;
    private static final int maxRange = 100;
    private static final int maxAttempts = 10;
    private static final int maxRounds = 3;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;
        System.out.println("NUMBER GUESSING GAME");
        System.out.println("Total Number Of Rounds : 3");
        System.out.println("Attempts To Guess Number In Each Round : 10");
        for (int i = 1; i <= maxRounds; i++) {
            int RandomNumber = random.nextInt(maxRange) + minRange;
            int attempts = 0;
            System.out.println("\nRound " + i + ": Guess the number between " + minRange + (" and ") + maxRange + " in "
                    + maxAttempts + " Attempts.");
            while (attempts < maxAttempts) {
                System.out.println("Enter your guess : ");
                int guess_number = scanner.nextInt();
                attempts = attempts + 1;
                if (guess_number == RandomNumber) {
                    int score = maxAttempts - attempts;
                    totalScore = totalScore + score;
                    System.out.println(
                            "Hurray! Number Guessed Successfully. Attempts = " + attempts + ". Round Score = " + score);
                    break;
                } else if (guess_number < RandomNumber) {
                    System.out.println("The number is greater than " + guess_number + ". Attempts Left = "
                            + (maxAttempts - attempts));
                } else if (guess_number > RandomNumber) {
                    System.out.println("The number is less than " + guess_number + ". Attempts Left = "
                            + (maxAttempts - attempts));
                }

            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry! You've used all attempts. The correct number was \n" + RandomNumber);
            }
        }
        System.out.println("Game Over. Total Score = " + totalScore);
    }
}

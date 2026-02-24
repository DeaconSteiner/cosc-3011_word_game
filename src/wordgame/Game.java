package wordgame;

import java.util.Scanner;

class Game {

    private Word secret;
    private WordList wordList;

    private void start() {
        // Change to src/full.txt for full game. test.txt is a placeholder for testing only.
        WordList wordList = new WordList("src/full.txt");

        secret = wordList.getRandom();
        Feedback fb;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter your guess: ");
            String guess = scanner.nextLine();

            fb = makeGuess(guess);
            printFeedback(fb);
        } while (!fb.isCorrect());

        System.out.println("YOU WIN!");
        scanner.close();
    }

    private Feedback makeGuess(String guess) {
        return new Word(guess).compareTo(secret);
    }

    private static void printFeedback(Feedback fb) {
        System.out.println(fb);
    }

    public static void main(String[] args) {
        new Game().start();
    }
}

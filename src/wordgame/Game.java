package wordgame;

import java.util.Scanner;

class Game {

    private Word secret;
    private WordList wordList;

    private void start() {
        // Wordlist kept small for easy validation. Could be expanded in future.
        wordList = new WordList(
            new String[] {
                "apple",
                "child",
                "hazel",
                "santa",
                "beard",
                "berry",
            }
        );

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

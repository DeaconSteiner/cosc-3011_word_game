package wordgame;

class Game {

    private Word secret;
    private WordList wordList;

    private void start() {}

    private Feedback makeGuess(String guess) {
        return null;
    }

    private void printFeedback(Feedback fb) {}

    public static void main(String[] args) {
        Word test = new Word("polar");
        Word other = new Word("apple");

        Feedback result = test.compareTo(other);

        System.out.println(result.toString());

        WordList words = new WordList(
            new String[] {
                "apple",
                "child",
                "hazel",
                "santa",
                "beard",
                "berry",
            }
        );

        Word secret = words.getRandom();
        System.out.println(secret);
    }
}

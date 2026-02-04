package wordgame;

class Feedback {

    private int correctLetters;
    private int correctPositions;
    private int wordLength;

    Feedback(int correctLetters, int correctPositions, int wordLength) {
        this.correctLetters = correctLetters;
        this.correctPositions = correctPositions;
        this.wordLength = wordLength;
    }

    @Override
    public String toString() {
        return "(" + correctLetters + ", " + correctPositions + ")";
    }

    public boolean isCorrect() {
        return correctPositions == wordLength;
    }
}

package wordgame;

import java.util.ArrayList;

class Word {

    private ArrayList<Character> letters;

    Word(String str) {
        letters = new ArrayList<>();

        for (char c : str.toLowerCase().toCharArray()) {
            letters.add(c);
        }
    }

    public Feedback compareTo(Word other) {
        int lCorrect = 0; // # of correct letters
        int pCorrect = 0; // # of letters in correct position

        // Used to check for wrong position, right letter
        ArrayList<Character> unmatched = new ArrayList<>();

        for (int i = 0; i < other.length(); i++) {
            if (this.letters.get(i).equals(other.letters.get(i))) {
                pCorrect++;
            } else {
                unmatched.add(other.letters.get(i));
            }
        }

        //TODO: Figure out how to check for correct letter, wrong position

        return new Feedback(lCorrect, pCorrect);
    }

    public int length() {
        return letters.size();
    }
}

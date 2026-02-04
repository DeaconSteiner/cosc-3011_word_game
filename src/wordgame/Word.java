package wordgame;

import java.util.ArrayList;
import java.util.HashSet;

class Word {

    private ArrayList<Character> letters;
    private String value;

    Word(String str) {
        value = str.toLowerCase();
        letters = new ArrayList<>();

        for (char c : str.toLowerCase().toCharArray()) {
            letters.add(c);
        }
    }

    // I think this might be an override... but dont quote me
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

        // Remove this if you want duplicates
        ArrayList<Character> noDuplicates = new ArrayList<>(
            new HashSet<>(unmatched)
        );

        for (int i = 0; i < noDuplicates.size(); i++) {
            if (this.letters.contains(noDuplicates.get(i))) {
                lCorrect++;
            }
        }
        return new Feedback(lCorrect, pCorrect, this.length());
    }

    @Override
    public String toString() {
        return value;
    }

    public int length() {
        return letters.size();
    }
}

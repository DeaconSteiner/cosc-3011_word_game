package wordgame;

import java.util.ArrayList;
import java.util.HashSet;
import java.io.Serializable;

class Word implements Serializable {

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
    // I checked - It's not
    public Feedback compareTo(Word other) {
        int lCorrect = 0; // # of letters in the word, but not in the right position
        int pCorrect = 0; // # of letters in correct position

        for (int i = 0; i < other.length(); i++) {
            if (this.letters.get(i).equals(other.letters.get(i))) {
                pCorrect++;
            }
            if (this.letters.contains(other.letters.get(i))) {
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

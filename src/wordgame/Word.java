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
        int correct = 0;
        char[] colors = new char[this.length()]; // Color array for GUI.
        // G = Green, Y = Yellow, B = Black/ Grey. 

        for (int i = 0; i < other.length(); i++) {
            if (this.letters.get(i).equals(other.letters.get(i))) {
                colors[i] = 'G';
                correct += 1;
            } else if (this.letters.contains(other.letters.get(i))) {
              colors[i] = 'Y';
            } else {
                colors[i] = 'B';
            }
        }

        return new Feedback(colors, correct, this.length());
    }

    @Override
    public String toString() {
        return value;
    }

    public int length() {
        return letters.size();
    }
}

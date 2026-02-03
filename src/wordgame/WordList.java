package wordgame;

import java.util.ArrayList;
import java.util.Random;

class WordList {

    private ArrayList<Word> words;

    WordList(String[] initList) {
        this.words = new ArrayList<>();

        for (String s : initList) {
            Word w = new Word(s);
            this.words.add(w);
        }
    }

    public Word getRandom() {
        Random randomizer = new Random();

        int randIndex = randomizer.nextInt(words.size());

        return words.get(randIndex);
    }
}

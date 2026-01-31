package wordgame;

import java.util.List;
import java.util.Random;

class WordList {

    private List<String> words;

    public WordList(List<String> words) {
        this.words = words;
    }

    public Word getRandom() {
        Random random = new Random();
        int index = random.nextInt(words.size());
        return new Word(words.get(index));
    }
}

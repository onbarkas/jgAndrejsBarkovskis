package lv.homework.lesson9.level2;

import java.util.HashMap;
import java.util.Map;

class UniqueWordCounter {
    private Map<String, Integer> vocabulary = new HashMap<>();
    private Integer timesUsed = 1;
    private Integer counter = 1;

    void addWord(String word) {
        if (word.isEmpty()) {
        } else if (vocabulary.containsKey(word)) {
            vocabulary.replace(word, counter = counter + 1);
        } else {
            vocabulary.put(word, timesUsed);
        }
    }

    void mostUsedWords(){
        System.out.println(vocabulary.values());
    }

    void printToConsole() {
        System.out.println(vocabulary);
    }
}



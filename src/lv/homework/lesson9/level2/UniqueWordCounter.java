package lv.homework.lesson9.level2;

import java.util.HashMap;
import java.util.Map;

class UniqueWordCounter {
    private Map<String, Integer> vocabulary = new HashMap<>();
    private Integer timesUsed = 1;
    private Integer counter = 1;
    private Integer max = 0;

    void addWord(String word) {
        if (word.isEmpty()) {
        } else if (vocabulary.containsKey(word)) {
            counter = vocabulary.get(word);
            vocabulary.replace(word, counter + 1);
        } else {
            vocabulary.put(word, timesUsed);
        }
    }

    void mostUsedWords() {
        getCounter();
        getMostUsedWord();
    }

    private void getCounter() {
        for (String itemList : vocabulary.keySet()) {
            if (vocabulary.get(itemList) > max) {
                max = vocabulary.get(itemList);
            }
        }
    }

    private void getMostUsedWord() {
        for (String itemList2 : vocabulary.keySet()) {
            if (vocabulary.get(itemList2) == max) {
                System.out.println("Most common used word - " + itemList2);
            }
        }
    }

    void printToConsole() {
        System.out.println(vocabulary);
    }
}



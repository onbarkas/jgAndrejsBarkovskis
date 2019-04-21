package lv.homework.lesson9.level2;

import java.util.HashMap;
import java.util.Map;

class UniqueWordCounter {
    private Map<String, Integer> vocabulary = new HashMap<>();
    private Integer timesUsed = 1;
    private Integer counter = 1;

    void addWord(String word) {
/*        if (word.isEmpty()) {
        } else if (vocabulary.containsKey(word)) {
            vocabulary.replace(word, timesUsed);
        } else {
            vocabulary.put(word, timesUsed);
        } timesUsed = 1;*/
    }

/*    void mostUsedWords(){
        for (Map.Entry<String, Integer> entry : vocabulary.entrySet()) {

            if (entry.getValue().compareTo(vocabulary.containsValue()) > 0) {
                System.out.println();
            }
        }
    }*/

    void printToConsole() {
        System.out.println(vocabulary);
    }
}



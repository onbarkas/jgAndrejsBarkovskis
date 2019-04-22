package lv.homework.lesson9.level2;

import java.util.HashMap;
import java.util.Map;

class UniqueWordCounter {
    private Map<String, Integer> vocabulary = new HashMap<>();
    private Integer counter = 1;
    private Integer max = 0;

    void addWord(String word) {
        if (word.isEmpty()) {
        } else if (vocabulary.containsKey(word)) {
            counter = vocabulary.get(word);
            vocabulary.replace(word, ++counter);
            if (counter > max) {max = counter;}
        } else {
            vocabulary.put(word, 1);
        }
    }

    void getMostUsedWord() {
        for (Integer itemList2 : vocabulary.values()) {
            if (itemList2.equals(max)) {
                System.out.println("Most common used word - " + itemList2);
            }
        }
    }

    void printToConsole() {
        System.out.println(vocabulary);
    }
}




/*    private void getCounter() {
        for (String itemList : vocabulary.keySet()) {
            if (vocabulary.get(itemList) > max) {
                max = vocabulary.get(itemList);
            }
        }
    }*/

/*    private void getMostUsedWord() {
        for (String itemList2 : vocabulary.keySet()) {
            if (vocabulary.get(itemList2) == max) {
                System.out.println("Most common used word - " + itemList2);
            }
        }
    }*/

/*    private void getCounter(){
        for (Integer ItemList : vocabulary.values()){
            if (ItemList > max) {
                max = ItemList;
            }
        }
    }*/




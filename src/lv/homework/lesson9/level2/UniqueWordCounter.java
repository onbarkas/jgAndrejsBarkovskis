package lv.homework.lesson9.level2;

import java.util.HashMap;
import java.util.Map;

//ctrl + alt + l
class UniqueWordCounter {
    private Map<String, Integer> vocabulary = new HashMap<>();
    private Integer counter = 1;
    private Integer max = 0;

    void addWord(String word) {
        if (word.isEmpty()) { //šo jāpārnes uz nākamo sadaļu: if (word.isEmpty() && vocabulary.containsKey(word))
        } else if (vocabulary.containsKey(word)) {
            counter = vocabulary.get(word);
            vocabulary.replace(word, ++counter);
            if (counter > max) {max = counter;}
        } else {
            vocabulary.put(word, 1);
        }
    }

    //metodes nosaukumā ir get, tas nozīmē, ka tai jāatgriež rezultāts
    void getMostUsedWord() {
        for (Integer itemList2 : vocabulary.values()) { //kāpēc "2" ??
            if (itemList2.equals(max)) {
                System.out.println("Most common used word - " + itemList2);
            }
        }
    }

    void printToConsole() {
        System.out.println(vocabulary);
    }
}


// 4hours

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




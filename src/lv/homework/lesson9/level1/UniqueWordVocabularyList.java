package lv.homework.lesson9.level1;

import java.util.HashSet;
import java.util.Set;

class UniqueWordVocabularyList {
    private Set<String> vocabulary = new HashSet<>();

    void addWord(String word) {

        if (word.isEmpty()) {
        } else {
            vocabulary.add(word);
        }
    }

    void getUniqueWords() {
        System.out.println("Unique words count is " + vocabulary.size());
    }

    void printToConsole() {
        for (String listOfWords: vocabulary){
            System.out.println(listOfWords);
        }
    }


}


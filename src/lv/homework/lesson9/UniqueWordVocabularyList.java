package lv.homework.lesson9;

import java.util.ArrayList;
import java.util.List;

class UniqueWordVocabularyList {
    private List<String> vocabulary = new ArrayList<>();

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


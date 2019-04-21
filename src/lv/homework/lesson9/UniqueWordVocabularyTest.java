package lv.homework.lesson9;

public class UniqueWordVocabularyTest {
    public static void main(String[] args) {
        UniqueWordVocabularyList uniqueWordVocabularyList = new UniqueWordVocabularyList();
        uniqueWordVocabularyList.addWord("pirmais");
        uniqueWordVocabularyList.addWord("");
        uniqueWordVocabularyList.addWord("tresais");
        uniqueWordVocabularyList.printToConsole();
        uniqueWordVocabularyList.getUniqueWords();

    }
}

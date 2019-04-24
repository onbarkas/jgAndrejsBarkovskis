package lv.homework.lesson9.level1;

public class UniqueWordVocabularyTest {
    public static void main(String[] args) {
        UniqueWordVocabularyList uniqueWordVocabularyList = new UniqueWordVocabularyList();
        uniqueWordVocabularyList.addWord("pirmais");
        uniqueWordVocabularyList.addWord("");
        uniqueWordVocabularyList.addWord("tresais");
        uniqueWordVocabularyList.addWord("ceturtais");
        uniqueWordVocabularyList.printToConsole();
        uniqueWordVocabularyList.getUniqueWords();

    }
}

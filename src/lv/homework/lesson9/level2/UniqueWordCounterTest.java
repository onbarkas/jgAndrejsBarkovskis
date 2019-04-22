package lv.homework.lesson9.level2;

public class UniqueWordCounterTest {
    public static void main(String[] args) {
        UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();
        uniqueWordCounter.addWord("Pirmais");
        uniqueWordCounter.addWord("Pirmais");
        uniqueWordCounter.addWord("otrais");
        uniqueWordCounter.addWord("treshais");
        uniqueWordCounter.addWord("ceturtais");
        uniqueWordCounter.addWord("Pirmais");
        uniqueWordCounter.addWord("otrais");
        uniqueWordCounter.addWord("Pirmais");
        uniqueWordCounter.addWord("Pirmais");
        uniqueWordCounter.addWord("otrais");
        uniqueWordCounter.mostUsedWords();
        uniqueWordCounter.printToConsole();

    }
}

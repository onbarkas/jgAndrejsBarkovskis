package lv.homework.lesson9;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

//trūkst metode getUniqueWords
public class UniqueWordVocabulary {
    public static void main(String[] args) {
        Set<String> vocabulary = new HashSet<>();
        addWord(vocabulary);
        addWord(vocabulary);
        addWord(vocabulary);
        addWord(vocabulary);
        printToConsole(vocabulary);
        vocabulary.iterator(); //šim nav jēga, un to labak neizmantot
    }

    public static void printToConsole(Set<String> vocabulary) {
        System.out.println(vocabulary);
    }

    public static void addWord(Set<String> vocabulary) {
        Scanner wordScanner = new Scanner(System.in); //skaneri deinējam klases līmenī, vai nodod kā parametru,
        // lai nav jāveido objekts katru reizi izsaucot metodi
        String words = wordScanner.nextLine();
        if (words.equals("")) {
            System.out.println("nevar but tukshs");
        } else {
            vocabulary.add(words);
        }


    }
}

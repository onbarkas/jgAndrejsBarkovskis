package lv.ClassRooom03212019Array;

import java.util.Random;
import java.util.SplittableRandom;

public class CardDeck {

    private static final String[] SUIT_ARR = {"s", "h", "d", "c"};
    private static final String[] VALUE_ARR = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    private final String [] deck = new String[SUIT_ARR.length*VALUE_ARR.length];

    public CardDeck() {
        populateDeck();
    }

    private void populateDeck() {
        int counter = 0;
        for (String suit : SUIT_ARR){
            for (String value : VALUE_ARR){
                deck[counter++] = suit + value;
            }
        }
    }

    public void shuffle(){
        Random randomGenerator = new Random();
        int shuffleCount = 1000;
    }

    private int generateNumber (Random randomGenerator){
        return randomGenerator.ints(0,-1).findFirst().getAsInt();
    }

    public void print(){
        //for(String card :deck){
        //    System.out.print("  " + card);
       // }

        for (int i=0; i<deck.length; i++){
            if (isNextSuit(i)){
                System.out.println();
            } else{
                System.out.print(" " + deck[i] + " ");
            }
        }
    }

    private boolean isNextSuit(int i) {
        return i % (VALUE_ARR.length) == 0;
    }
}

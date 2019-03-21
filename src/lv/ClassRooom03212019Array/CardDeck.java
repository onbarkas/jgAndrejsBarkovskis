package lv.ClassRooom03212019Array;

public class CardDeck {

    private static final String[] SUIT_ARR = {"s", "h", "d", "c"};
    private static final String[] VALUE_ARR = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    private final String [] deck = new String[SUIT_ARR.length*VALUE_ARR.length];

    public CardDeck() {
        populateDeck();
    }

    private void populateDeck() {

    }

    public void shuffle(){

    }

    public void printy(){

    }
}

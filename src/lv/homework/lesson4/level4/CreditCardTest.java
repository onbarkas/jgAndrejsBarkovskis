package lv.homework.lesson4.level4;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.showBilance("STR");
        creditCard.moneyIn(200, "STR");
        creditCard.showBilance("STR");
        creditCard.moneyOut(51.54, "STR");
        creditCard.showBilance("STR");
    }
}

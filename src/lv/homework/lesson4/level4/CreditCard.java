package lv.homework.lesson4.level4;

public class CreditCard {
    int cardID;
    double debetBilance = 100;
    double creditUsed = 0;
    double creditLimit = 200;
    String pinCode;
    double availableAmount;
    double amount;

/*    public void moneyIn() {
//verifikacija
        if topup() == true {
        }

        public void moneyOut () {
//verifikacija
        }*/

        public boolean topup(double amount, String pinCode){
            return this.pinCode.equals(pinCode) && (amount > 0);
        }

/*    boolean isEnoughMoney() {
        if ((availableAmount - amount) > 0.001);{}
    }*/
    }


package lv.homework.lesson4.level4;

class CreditCard {
    private int cardID;
    private double debetBilance = 100;
    private double creditUsed = 150;
    private double creditLimit = 200;
    private String pinCode = "STR";
    private double availableAmount;
    private double amount;

    void moneyIn(double amount, String pinCode) {
        if (this.pinCode.equals(pinCode)) {
            creditUsed = creditUsed - amount;
            if (creditUsed < 0) {
                debetBilance =  debetBilance + (0 - creditUsed);
            }
            System.out.println("ss" + amount + "\n" + creditUsed + "\n" + debetBilance);
        } else {
            System.out.println("neizdevas" + amount + pinCode);
        }
    }

/*        public void moneyOut () {
//verifikacija
        }*/

/*    public boolean topup(double amount, String pinCode) {
        return this.pinCode.equals(pinCode)
                && (amount > this.amount)
    }*/

/*    boolean isEnoughMoney() {
        if ((availableAmount - amount) > 0.001);{}
    }*/
}


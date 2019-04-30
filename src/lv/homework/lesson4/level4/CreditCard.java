package lv.homework.lesson4.level4;

class CreditCard {
    private int cardID = 12345;
    private double availableAmount = 0;
    private double creditUsed = 150;
    private double creditLimit = 200;
    private String pinCode = "STR";

    void moneyIn(double amount, String pinCode) {
        if (pinCodeCheck(pinCode)) {
            if (amount > 0) {
                creditUsed = creditUsed - amount;
                if (creditUsed < 0) {
                    availableAmount = availableAmount + (0 - creditUsed);
                    creditUsed = 0;
                    System.out.println("Nauda ieskaitita " + amount + " euro apmera");
                }
            } else System.out.println("summai jabut lielakai par 0");
        } else {
            System.out.println("Nepareizs pin kods");
        }
    }

    void moneyOut(double amount, String pinCode) {
        if (pinCodeCheck(pinCode)) {
            if (amount > 0) {
                if (amount < (availableAmount + creditLimit)) {
                    availableAmount = availableAmount - amount;
                    if (availableAmount < 0) {
                        creditUsed = creditUsed + (0 - availableAmount);
                        availableAmount = 0;
                        System.out.println("Nauda iznemta " + amount + " euro apmera");
                    }
                } else System.out.println("Summa parsniedz bilanci ar kredit limitu");
            } else System.out.println("summai jabut lielakai par 0");
        } else System.out.println("Nepareizs pin kods");

    }

    void showBilance(String pinCode) {
        if (pinCodeCheck(pinCode)) {
            System.out.println("\n" + "Jusu konta parskats" + "\n"
                    + "======================" + "\n"
                    + "debeta bilance = " + availableAmount + "\n"
                    + "kredīta limits = " + creditLimit + "\n"
                    + "kredīta aizņemums = " + creditUsed + "\n"
                    + "======================" + "\n");
        }
    }

    private boolean pinCodeCheck(String pinCode) {
        return this.pinCode.equals(pinCode);
    }
}


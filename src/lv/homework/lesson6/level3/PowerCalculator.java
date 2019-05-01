package lv.homework.lesson6.level3;

class PowerCalculator {
    int pow(int number, int power) {
        int sum = 0;
        if (number > 0 && power > 0) {
            sum++;
            for (int i = 1; i <= power; i++) {
                sum *= number;
            }
        }
        return sum;
    }
}


/*package lv.homework.lesson6.level3;

public class PowerCalculator {
    //šādu stāvokli nevajag glabāt, jo tas mainās atkarībā no iedotajiem lielumiem metodei
    private int sum = 1;  //šim ir jābūt metodē

    public int getSum() {
        return sum;
    }//nav neieciešami

    public void setSum(int sum) {
        this.sum = sum;
    } //nav neieciešami

    //metodei jāatgriež rezultāts - nevis tas jāizvada konsolē
    public void pow(int number, int power) {
        if ((number > 0) && (power > 0)) { //par daud () -> if (number > 0 && power > 0) {
            for (int i = 1; i <= power; i++) {
                sum = sum * number;// sum *= number
            }
            System.out.println(sum);
        } else {
            System.out.println("Var but tikai pozitivie skaitli");
        }

    }
}*/

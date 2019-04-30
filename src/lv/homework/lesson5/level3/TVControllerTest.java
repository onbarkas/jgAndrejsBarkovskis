package lv.homework.lesson5.level3;

import lv.homework.lesson5.level2.TV;

public class TVControllerTest {
    public static void main(String[] args) {
        TV tv = new TV();
        TVController tvTest = new TVController();
        tvTest.setTv(tv);
    }
}

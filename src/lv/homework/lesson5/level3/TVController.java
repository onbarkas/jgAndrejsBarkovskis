package lv.homework.lesson5.level3;

import lv.homework.lesson5.level2.TV;

public class TVController {
    private TV tv;

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    @Override
    public String toString() {
        return "TVController{" +
                "tv=" + tv +
                '}';
    }
}

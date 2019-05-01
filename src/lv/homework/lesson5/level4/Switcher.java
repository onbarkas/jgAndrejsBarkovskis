package lv.homework.lesson5.level4;

public class Switcher {
    private LightBulb lightBulb;
    LightBulb turnedOn;

    public LightBulb getLightBulb() {
        return lightBulb;
    }

    public void setLightBulb(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public LightBulb getTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(LightBulb turnedOn) {
        this.turnedOn = turnedOn;
    }

    public void connect(LightBulb turnedOn){
        this.turnedOn = turnedOn;
    }

    public void switchOnOff(){

    }
}

package lv.homework.lesson5;

public class Switcher {
    private String lightBulb;
    private boolean turnedOn;

    public String getLightBulb() {
        return lightBulb;
    }

    public void setLightBulb(String lightBulb) {
        this.lightBulb = lightBulb;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public void connect(){

    }

    public void switchOnOff(){
        turnedOn = true;
    }
}

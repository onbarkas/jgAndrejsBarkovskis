package lv.homework.lesson5.level4;

public class LightBulb {
    private boolean turnedOn = false;
    private int currentTurnOnCount = 0;
    private int MAX_TURN_ON_COUNT = 5;

    public boolean isTurnedon() {
        return turnedOn;
    }

    public void setTurnedon(boolean turnedon) {
        this.turnedOn = turnedon;
    }

    public int getCurrentTurnOnCount() {
        return currentTurnOnCount;
    }

    public void setCurrentTurnOnCount(int currentTurnOnCount) {
        this.currentTurnOnCount = currentTurnOnCount;
    }

    public int getMAX_TURN_ON_COUNT() {
        return MAX_TURN_ON_COUNT;
    }

    public void setMAX_TURN_ON_COUNT(int MAX_TURN_ON_COUNT) {
        this.MAX_TURN_ON_COUNT = MAX_TURN_ON_COUNT;
    }

    public void turnOn(){
        if (this.getMAX_TURN_ON_COUNT() > 0) {
            this.turnedOn = true;
            MAX_TURN_ON_COUNT--;
            currentTurnOnCount++;
        }
    }

    public void turnOf(){
        this.turnedOn = false;
    }
}

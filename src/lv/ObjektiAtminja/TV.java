package lv.ObjektiAtminja;

public class TV {
    private int currentChanel, currentVolumeLevel;
    private String manufacturer;
    private boolean turnedOn;

    public int getCurrentChanel() {
        return currentChanel;
    }

    public void setCurrentChanel(int currentChanel) {
        this.currentChanel = currentChanel;
    }

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    public void setCurrentVolumeLevel(int currentVolumeLevel) {
        this.currentVolumeLevel = currentVolumeLevel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public void nextChanel(){
        if (turnedOn == true)
        currentChanel++;
    }

    public void previousChanel(){
        if (turnedOn == true)
        currentChanel--;
    }

    public void increaseChanel(){
        if (turnedOn == true)
        currentVolumeLevel++;
    }

    public void decreaseChanel(){
        if (turnedOn == true)
        currentVolumeLevel--;
    }

    public void turnOn(){
        turnedOn = true;
    }

    public void turnOf(){
        turnedOn = false;
    }


}

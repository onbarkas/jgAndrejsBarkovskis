package lv.homework.lesson5;

import java.util.Objects;

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

    public void increaseVolume(){
        if (turnedOn == true)
        currentVolumeLevel++;
    }

    public void decreaseVolume(){
        if (turnedOn == true)
        currentVolumeLevel--;
    }

    public void turnOn(){
        turnedOn = true;
    }

    public void turnOf(){
        turnedOn = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TV)) return false;
        TV tv = (TV) o;
        return getCurrentChanel() == tv.getCurrentChanel() &&
                getCurrentVolumeLevel() == tv.getCurrentVolumeLevel() &&
                isTurnedOn() == tv.isTurnedOn() &&
                getManufacturer().equals(tv.getManufacturer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCurrentChanel(), getCurrentVolumeLevel(), getManufacturer(), isTurnedOn());
    }

    @Override
    public String toString() {
        return "TV{" +
                "currentChanel=" + currentChanel +
                ", currentVolumeLevel=" + currentVolumeLevel +
                ", manufacturer='" + manufacturer + '\'' +
                ", turnedOn=" + turnedOn +
                '}';
    }
}

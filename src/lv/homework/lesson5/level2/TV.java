package lv.homework.lesson5.level2;

import java.util.Objects;

public class TV {
    private int currentChanel, currentVolumeLevel;
    private String manufacturer;
    private boolean turnedOn;

    private int getCurrentChanel() {
        return currentChanel;
    }

    void setCurrentChanel(int currentChanel) {
        this.currentChanel = currentChanel;
    }

    private int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    void setCurrentVolumeLevel(int currentVolumeLevel) {
        this.currentVolumeLevel = currentVolumeLevel;
    }

    private String getManufacturer() {
        return manufacturer;
    }

    void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    private boolean isTurnedOn() {
        return turnedOn;
    }

    void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public void nextChanel() {
        if (turnedOn)
            currentChanel++;
    }

    public void previousChanel() {
        if (turnedOn)
            currentChanel--;
    }

    public void increaseVolume() {
        if (turnedOn)
            currentVolumeLevel++;
    }

    void decreaseVolume() {
        if (turnedOn)
            currentVolumeLevel--;
    }

    void turnOn() {
        turnedOn = true;
    }

    void turnOf() {
        turnedOn = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TV)) return false;
        TV tv = (TV) o;
        //neizmanto geterus
        return getCurrentChanel() == tv.getCurrentChanel() &&
                getCurrentVolumeLevel() == tv.getCurrentVolumeLevel() &&
                isTurnedOn() == tv.isTurnedOn() &&
                getManufacturer().equals(tv.getManufacturer());
    }

    @Override
    public int hashCode() {
        //neizmanto geterus
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

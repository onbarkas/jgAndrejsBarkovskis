package lv.homework.lesson5.level2;

import java.util.Objects;

public class TV {
    private int currentChanel, currentVolumeLevel;
    private String manufacturer;
    private boolean turnedOn;

    void setCurrentChanel(int currentChanel) {
        this.currentChanel = currentChanel;
    }

    void setCurrentVolumeLevel(int currentVolumeLevel) {
        this.currentVolumeLevel = currentVolumeLevel;
    }

    void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    void nextChanel() {
        if (turnedOn) {
            currentChanel++;
            System.out.println("ieslegts nakosais kanals");
        }
    }

    void previousChanel() {
        if (turnedOn) {
            currentChanel--;
            System.out.println("ieslegts ieprieksejais kanals");
        }
    }

    void increaseVolume() {
        if (turnedOn) {
            currentVolumeLevel++;
            System.out.println("skanja ir palielinata");
        }
    }

    void decreaseVolume() {
        if (turnedOn) {
            currentVolumeLevel--;
            System.out.println("skanja ir samazinata");
        }
    }

    void turnOn() {
        turnedOn = true;
        System.out.println("TV ieslegts");
    }

    void turnOf() {
        turnedOn = false;
        System.out.println("TV izslegts");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return currentChanel == tv.currentChanel &&
                currentVolumeLevel == tv.currentVolumeLevel &&
                turnedOn == tv.turnedOn &&
                manufacturer.equals(tv.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChanel, currentVolumeLevel, manufacturer, turnedOn);
    }


    @Override
    public String toString() {
        return "TV{" +
                "currentChanel=" + currentChanel +
                ", currentVolumeLevel=" + currentVolumeLevel +
                ", manufacturer='" + manufacturer + '\'' +
                ", turnedOn=" + turnedOn +
                '}' + "\n";
    }
}

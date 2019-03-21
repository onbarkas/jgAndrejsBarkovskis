package lv.homework.lesson5;

import java.util.Objects;

public class SmartPhone {
    private String manufactor, color, processorType;
    private double screenSize;

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhone that = (SmartPhone) o;
        return Objects.equals(manufactor, that.manufactor) &&
                Objects.equals(color, that.color) &&
                Objects.equals(processorType, that.processorType) &&
                Objects.equals(screenSize, that.screenSize);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "manufacturer " + manufactor + '\'' +
                ", color " + color + '\'' +
                ", processorType= " + processorType + '\'' +
                ", screenSize " + screenSize +
                '}';
    }
}

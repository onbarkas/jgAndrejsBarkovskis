package lv.homework.lesson6;

public class Car {
    private String model, color;
    private int maxSpeed, currentSpeed;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void accelerate() {
        if (currentSpeed < 200){currentSpeed++;}
    }

    public void slowDown() {
        if (currentSpeed > 0){currentSpeed--;}
    }

    public boolean isDriving() {
        //var daudz īsāk
        return currentSpeed > 0;
       // if (currentSpeed > 0) {
       //     return true;
     //   } else return false;
    }

    public boolean canAccelerate() {
        //var daudz īsāk
        //return currentSpeed < maxSpeed
        if (currentSpeed < maxSpeed) {
            return true;
        } else return false;
    }

    public void speedUp() {
        for (int i = currentSpeed; i < maxSpeed; i++) {
            accelerate();
        }
    }
}

package lv.homework.lesson6.level2;

class Car {
    private String model, color;
    private int maxSpeed, currentSpeed;

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    int getMaxSpeed() {
        return maxSpeed;
    }

    void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    int getCurrentSpeed() {
        return currentSpeed;
    }

    void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    private void accelerate() {
        if (currentSpeed < 200) {
            currentSpeed++;
        }
    }

    void slowDown() {
        if (currentSpeed > 0) {
            currentSpeed--;
        }
    }

    boolean isDriving() {
        return currentSpeed > 0;
    }

    boolean canAccelerate() {
        return (currentSpeed < maxSpeed);
    }

    void speedUp() {
        for (int i = currentSpeed; i < maxSpeed; i++) {
            accelerate();
        }
    }
}

/*    public boolean isDriving() {
        //var daudz īsāk
        return currentSpeed > 0;
        // if (currentSpeed > 0) {
        //     return true;
        //   } else return false;
    }*/

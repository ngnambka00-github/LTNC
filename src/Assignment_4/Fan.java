package Assignment_4;

public class Fan {
    private Speed speed;
    private boolean on;
    private double radius;
    private String color;

    // Default Constructor
    public Fan() {
        speed = Speed.SLOW;
        on = false;
        radius = 5;
        color = "Xanh lam";
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed newSpeed) {
        this.speed = newSpeed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean newOn) {
        this.on = newOn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String result = "";
        if (on) {
            result = "Fan{ Speed: " + String.valueOf(speed)
                    + ", color: " + color
                    + ", radius: " + String.valueOf(radius) + " }";
        } else {
            result = "Fan{ Color: " + color
                    + ", radius: " + String.valueOf(radius) + " } -> Quat tat";
        }
        return result;
    }
}

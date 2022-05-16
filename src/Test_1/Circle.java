package Test_1;

public class Circle {
    private double radius;

    public Circle (double radius) throws InvalidRadiusException{
        if(radius >=0) {
            this.radius = radius;
        } else{
            throw new InvalidRadiusException(radius);
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidRadiusException {
        if(radius >=0) {
            this.radius = radius;
        } else{
            throw new InvalidRadiusException(radius);
        }
    }

}

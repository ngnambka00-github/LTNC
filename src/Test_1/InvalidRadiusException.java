package Test_1;

public class InvalidRadiusException extends Exception {
    public InvalidRadiusException(double invalidRadius) {
        super("Invalid radius: " + String.valueOf(invalidRadius));
    }
}

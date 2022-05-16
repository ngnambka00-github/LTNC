package Test_1;

public class Bai3 {
    public static void main(String[] args) {
        try {
            Circle circle = new Circle(-5);
        } catch (InvalidRadiusException e) {
            System.err.println("[ERROR]: " + e.getMessage());
        }
    }
}

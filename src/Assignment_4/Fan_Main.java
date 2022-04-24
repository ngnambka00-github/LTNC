package Assignment_4;

public class Fan_Main {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.setSpeed(Speed.FAST);
        f1.setOn(true);
        f1.setRadius(10);
        f1.setColor("Vang");

        Fan f2 = new Fan();
        f2.setRadius(5);
        f2.setColor("Xanh lam");

        System.out.println("Infor 1: " + f1.toString());
        System.out.println("Infor 2: " + f2.toString());
    }
}

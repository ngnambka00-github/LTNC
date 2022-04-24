package Assignment_2;

import java.io.IOException;
import java.util.Scanner;

public class StopWatch_Main {
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();

        System.out.println("Press any key to start: ");
        waitPress();
        sw.start();

        System.out.println("Press any key to end: ");
        waitPress();
        sw.stop();

        System.out.println("Elapsed time: " + sw.getElapseTime());
    }

    public static void waitPress() {
        new Scanner(System.in).next();
    }
}

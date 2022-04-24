package Assignment_2;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random rand = new Random(1000);

        for (int i = 0; i < 50; i++) {
            System.out.printf("RandomNumber [%02d]: %02d\n", (i + 1), rand.nextInt(100));
        }
    }
}

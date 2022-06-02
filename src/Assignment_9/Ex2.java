package Assignment_9;

import java.io.*;
import java.util.Random;

public class Ex2 {
    // Exercise 2:
    // Create file named Ex2.txt if that file is not existed
    // Write 150 int random numbers into file
    // Each number is separated by space letter.
    public static void main(String[] args) {
        File file = new File("Ex2.txt");
        // create new file
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        int iterNum = 150;
        Random random = new Random();
        try (
            // append mode = true
            FileOutputStream os = new FileOutputStream(file, true);
        ) {
            for (int i = 0; i < iterNum; i++) {
                int randNum = random.nextInt(1000);
                os.write(randNum);
                os.write(' ');
            }

            System.out.println("Writing to file done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

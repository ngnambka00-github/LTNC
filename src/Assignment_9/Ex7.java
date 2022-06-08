package Assignment_9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Ex7 {

    public static double generateRandomSalary(String rank) {
        Random random = new Random();
        if (rank.equals("assistant")) {
            return random.nextInt(80000 - 50000) + 50000 + random.nextDouble();
        } else if (rank.equals("teacher")) {
            return random.nextInt(110000 - 60000) + 60000 + random.nextDouble();
        } else if (rank.equals("associate")) {
            return random.nextInt(130000 - 75000) + 75000 + random.nextDouble();
        }
        return 0;
    }

    public static void main(String[] args) {
        File file = new File("Salary.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        String[] rankArr = {"assistant", "teacher", "associate"};
        Random random = new Random();

        int iterNum = 1000;
        try (PrintWriter output = new PrintWriter(file)) {
            for (int i = 0; i < iterNum; i++) {
                String rank = rankArr[random.nextInt(3)];
                double salary = generateRandomSalary(rank);
//                output.write("FirstName" + (i+1) + " LastName" + (i+1) + " " + rank + " " + salary + "\n");
                output.printf("FirstName%d LastName%d %s %.2f\n", (i + 1), (i + 1), rank, salary);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package Assignment_9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        File file = new File("Salary.txt");
        if (!file.exists()) {
            System.out.println("Salary.txt File Not Found");
            System.exit(0);
        }

        try (
            Scanner input = new Scanner(file);
        ){
            List<String> rankList = new ArrayList<>();
            List<Double> salaryTotalPerRank = new ArrayList<>();

            while (input.hasNext()) {
                String firstName = input.next();
                String lastName = input.next();
                String rank = input.next();
                double salary = input.nextDouble();

                int index = rankList.indexOf(rank);
                if (index == -1) {
                    rankList.add(rank);
                    salaryTotalPerRank.add(salary);
                } else {
                    salaryTotalPerRank.set(index, salaryTotalPerRank.get(index) +  salary);
                }
            }

            for (int i = 0; i < rankList.size(); i++) {
                System.out.printf("Total salary for %s: %.2f\n", rankList.get(i), salaryTotalPerRank.get(i));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

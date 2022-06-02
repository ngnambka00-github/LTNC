package Assignment_9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex1 {

    // Exercise 1:
    // Count the number of letters, words, lines in a file that having format .txt (Ex1.txt)
    // The words are separated by a spacebar character

    public static void main(String[] args) {
        File file = new File("Ex1.txt");

        try (
                Scanner input = new Scanner(file);
        ) {
            // Initialize count for line, word, letter
            int lineCounts = 0;
            int wordCounts = 0;
            int letterCounts = 0;

            while (input.hasNext()) {
                // count lines
                lineCounts += 1;

                String line = input.nextLine();
                if (line.length() > 0) {
                    // count words
                    String[] listWordsInLine = line.split("\\s+");
                    wordCounts += listWordsInLine.length;

                    // count letters
                    for (String words : listWordsInLine) {
                        letterCounts += words.length();
                    }
                }
            }

            // show result's information
            System.out.println("The number of lines: " + lineCounts);
            System.out.println("The number of words: " + wordCounts);
            System.out.println("The number of letters: " + letterCounts);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

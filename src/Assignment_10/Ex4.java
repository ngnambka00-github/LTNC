package Assignment_10;

import java.io.File;

public class Ex4 {
    // Bài 4:
    // Tính tổng dung lượng của một tệp hoặc một thư mục sử dụng hàng đợi.
    // Gợi ý: phương thức length() trả về kích thước của tệp (byte),
    // trả về 0 nếu không tồn tại tệp hoặc đó là một thư mục.
    public static void main(String[] args) {
        String fileFolderName = "src/Assignment_10";
        File file = new File(fileFolderName);

        // check state of file variable whether it is file, folder or not existed
        byte checkState = 0;
        if (file.isFile()) {
            checkState = 1;
        } else if (file.isDirectory()) {
            checkState = 2;
        } else {
            System.out.println("Not exist");
        }

        // checkState = 0 => File is not existed, then exit program
        if (checkState == 0) {
            System.out.println("[Error]: input file name is not valid!");
            System.exit(0);
            return;
        }

        // checkState = 1 => Input is a file
        if (checkState == 1) {
            System.out.println("Capacity of input file: " + file.length() + " bytes");
            return;
        }

        // checkState = 2 => Input is a folder
        // add all files of folder to a queue, then loop the queue to compute cumulative sum of each file size for total capacities.
        int sumCap = 0;
        if (checkState == 2) {
            File[] arrayFile = file.listFiles();
            for (File f : arrayFile) {
                sumCap += f.length();
            }

            System.out.println("Capacity of input folder: " + sumCap + " bytes");
        }
    }
}

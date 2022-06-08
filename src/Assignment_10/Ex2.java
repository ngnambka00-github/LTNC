package Assignment_10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex2 {
    // Bài 2:
    // Viết một chương trình thử nghiệm lưu trữ danh sách 5 triệu số nguyên theo thứ tự tăng dần (1,2,.., 5000000)
    // trong ArrayList, hiển thị thời gian thực thi khi duyệt qua danh sách bằng iterator
    // và hiển thị thời gian thực thi khi duyệt danh sách bằng cách sử dụng hàm get (chỉ mục).
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        for (int i = 1; i <= 5000000; i++) {
            intList.add(i);
        }

        // Print execute time for loop with iterator instance.
        long startIterator1 = System.nanoTime();
        for (int i = 0; i < intList.size(); i++) {
            int item = intList.get(i);
        }
        long endIterator1 = System.nanoTime();
        System.out.println("Measure execute time for iterator 1: " + (endIterator1 - startIterator1));


        // Print execute time for loop using get index function
        Iterator<Integer> intIterator = intList.iterator();
        long startIterator2 = System.nanoTime();
        while (intIterator.hasNext()) {
            int item = intIterator.next();
        }
        long endIterator2 = System.nanoTime();
        System.out.println("Measure execute time for iterator 2: " + (endIterator2 - startIterator2));
    }
}

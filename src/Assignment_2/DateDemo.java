package Assignment_2;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();

        System.out.printf("%-25s %s\n", "Time 1: + 10000: ", new Date(d.getTime() + 10000l).toString());
        System.out.printf("%-25s %s\n", "Time 2: + 100000: ", new Date(d.getTime() + 100000l).toString());
        System.out.printf("%-25s %s\n", "Time 3: + 1000000: ", new Date(d.getTime() + 1000000l).toString());
        System.out.printf("%-25s %s\n", "Time 4: + 10000000: ", new Date(d.getTime() + 10000000l).toString());
        System.out.printf("%-25s %s\n", "Time 5: + 100000000: ", new Date(d.getTime() + 100000000l).toString());
        System.out.printf("%-25s %s\n", "Time 6: + 1000000000: ", new Date(d.getTime() + 1000000000l).toString());
        System.out.printf("%-25s %s\n", "Time 7: + 10000000000: ", new Date(d.getTime() + 10000000000l).toString());
        System.out.printf("%-25s %s\n", "Time 8: + 100000000000: ", new Date(d.getTime() + 100000000000l).toString());

    }
}

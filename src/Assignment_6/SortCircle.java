package Assignment_6;

import java.util.Arrays;

public class SortCircle {
    private Circle[] circleArray;

    public SortCircle(Circle[] circleArray) {
        this.circleArray = circleArray;
    }

    // sort ascending order array
    public void sortOrderAsc() {
        Arrays.sort(circleArray);
    }

    // get information of each circle in array
    public void printInformation() {
        for (int i = 0; i < circleArray.length; i++) {
            System.out.println("Info[" + i + "]: ");
            System.out.println(circleArray[i].toString());
        }
    }
}

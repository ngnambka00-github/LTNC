package Assignment_10;

public class Ex5 {
    // Bài 5:
    // Thực hiện lại ví dụ phần Comparator trong slide.
    // Bổ sung thêm hàm sắp xếp một danh sách các hình theo trật tự tăng dần sử dụng giải thuật sắp xếp chọn (selection sort).
    public static void main(String[] args) {
        GeometricObject[] list1 = {new Circle(5), new Rectangle(4, 5),
                new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5),
                new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
                new Circle(6.5), new Rectangle(4, 5)};

        GeometricObject.sort(list1, true);


        for (GeometricObject g : list1) {
            System.out.printf("Area: %-9.3f %s\n", g.getArea(), g.toString());
        }

    }
}

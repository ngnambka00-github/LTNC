package Assignment_5;

import java.util.Date;

public class GeometricObject {
    protected String color;
    protected boolean filled;
    protected Date dateCreated;

    // Hàm khởi tạo mặc định
    public GeometricObject() {
        color = "white";
        filled = false;
        dateCreated = new Date();
    }

    // Khởi tạo 2 tham số
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    // Trả lại màu sắc
    public String getColor() {
        return color;
    }

    // Đặt lại mày mới
    public void setColor(String color) {
        this.color = color;
    }

    // Kiểm tra đã tô màu hay chưa
    public boolean isFilled() {
        return filled;
    }

    // Gán đã tô màu / chưa tô màu
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Trả về ngày tạo
    public Date getDateCreated() {
        return dateCreated;
    }

    // Trả về chuỗi mô tả đối tượng
    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
}

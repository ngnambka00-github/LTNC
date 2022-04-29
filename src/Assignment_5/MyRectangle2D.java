package Assignment_5;

public class MyRectangle2D {
    // Tâm của hình chữ nhật
    private double x, y;

    // Chiều rộng và chiều cao của hình chữ nhật
    private double width, height;

    public MyRectangle2D() {
        x = 0; y = 0;
        width = 1; height = 1;
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Tính diện tích
    public double getArea() {
        return width * height;
    }

    // Tính chu vi
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Kiểm tra tạo độ (x, y) truyền vào có nằm trong hình chữ nhật this không?
    public boolean contains(double x, double y) {
        // Tính tọa độ của 4 góc
        // Góc trên cùng bên trái
        double xTopLeft = this.x - width / 2;
        double yTopLeft = this.y + height / 2;
        if (x < xTopLeft || y > yTopLeft) return false;

        // Góc trên cùng bên phải
        double xTopRight = this.x + width / 2;
        double yTopRight = this.y + height / 2;
        if (x > xTopRight || y > yTopRight) return false;

        // Góc dưới cùng bên trái
        double xBottomLeft = this.x - width / 2;
        double yBottomLeft = this.y - height / 2;
        if (x < xBottomLeft || y < yBottomLeft) return false;

        // Góc dưới cùng bên phải
        double xBottomRight = this.x + width / 2;
        double yBottomRight = this.y - height / 2;
        if (x > xBottomRight || y < yBottomRight) return false;

        return true;
    }

    // Kiểm tra xem hình chữ nhật truyền vào có nằm trong hình chữ nhật this không?
    public boolean contains(MyRectangle2D r) {
        // So sánh 4 điểm ở góc HCN nếu 4 điểm cùng nằm ở trong hình gốc sẽ trả về True
        double rX = r.getX(), rY = r.getY(), rWidth = r.getWidth(), rHeight = r.getHeight();

        // Góc trên cùng bên trái
        double xTopLeft = rX - rWidth / 2;
        double yTopLeft = rY + rHeight / 2;
        if (!contains(xTopLeft, yTopLeft)) return false;

        // Góc trên cùng bên phải
        double xTopRight = rX + rWidth / 2;
        double yTopRight = rY + rHeight / 2;
        if (!contains(xTopRight, yTopRight)) return false;

        // Góc dưới cùng bên trái
        double xBottomLeft = rX - rWidth / 2;
        double yBottomLeft = rY - rHeight / 2;
        if (!contains(xBottomLeft, yBottomLeft)) return false;

        // Góc dưới cùng bên phải
        double xBottomRight = rX + rWidth / 2;
        double yBottomRight = rY - rHeight / 2;
        if (!contains(xBottomRight, yBottomRight)) return false;

        return true;
    }
}

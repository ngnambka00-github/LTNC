package Assignment_1.Circle;

public class Circle {
    private Point p;
    private double banKinh;

    public Circle() {
    }

    public Circle(Point p, double banKinh) {
        this.p = p;
        this.banKinh = banKinh;
    }

    public Feature getFeature(Circle c) {
        double khoangCach = p.getDistance(c.getPoint());

        if (khoangCach > (banKinh + c.getBanKinh())) {
            return Feature.KHONG_GIAO;
        } else if (khoangCach < (banKinh + c.getBanKinh())) {
            return Feature.GIAO_NHAU;
        }

        return Feature.NAM_TRONG;
    }

    public Point getPoint() {
        return p;
    }

    public double getBanKinh() {
        return banKinh;
    }
}
package Assignment_5;

public enum Status {
    FRESHMAN(1), SOPHOMORE(2), JUNIOR(3), SENIOR(4);

    public final int label;

    private Status(int label) {
        this.label = label;
    }
}

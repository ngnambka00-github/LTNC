package Assignment_4;

public enum Speed {
    SLOW(1), MEDIUM(2), FAST(3);

    public final int label;

    private Speed(int label) {
        this.label = label;
    }
}

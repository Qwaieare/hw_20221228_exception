package Exceptions;

public enum Capacity {
    ESPEC_SMALL(0, 10),
    SMALL(10, 25),
    AVERAGE(40, 50),
    LARGE(60, 80),
    ESPEC_BIG(100, 120);

    private final int from;
    private final int to;

    Capacity(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

}

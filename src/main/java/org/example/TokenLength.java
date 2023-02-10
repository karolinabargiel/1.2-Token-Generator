package org.example;
public enum TokenLength {
    FIVE(5),
    TEN(10),
    FIFTEEN(15);
    private final int length;
    TokenLength(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }
}

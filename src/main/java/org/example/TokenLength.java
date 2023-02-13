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

    public static TokenLength getTokenByLength(int length) {
        for (TokenLength tokenLength : values()) {
            if (tokenLength.getLength() == length) {
                return tokenLength;
            }
        }
        throw new IllegalArgumentException(String.valueOf(length));
    }
}

package UebungenZoe.Uebung6;

public enum Value {
    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9);

    private final int digit;

    Value(int digit) {
        this.digit = digit;
    }

    public int toInt() {
        return digit;
    }

    @Override
    public String toString() {
        return Integer.toString(digit);
    }

    public static Value of(int id) {
        if (id < 1 || id > 9) {
            throw new IllegalArgumentException("Value.of: id muss eine Zahl 1-9 sin, nicht " + id);
        }
        switch (id) {
            case 1: return ONE;
            case 2: return TWO;
            case 3: return THREE;
            case 4: return FOUR;
            case 5: return FIVE;
            case 6: return SIX;
            case 7: return SEVEN;
            case 8: return EIGHT;
            case 9: return NINE;
        }

        throw new AssertionError();
    }
}
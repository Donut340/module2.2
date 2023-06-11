package src;

/**
 * Represents the rank of a playing card.
 */
public enum Rank {
    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
    JACK(10), QUEEN(10), KING(10);

    private int value;

    /**
     * Constructs a rank with the given value.
     *
     * @param value the value of the rank
     */
    Rank(int value) {
        this.value = value;
    }

    /**
     * Gets the value of the rank.
     *
     * @return the value of the rank
     */
    public int getValue() {
        return value;
    }
}

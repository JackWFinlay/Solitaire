/**
 * @author Jack Finlay - 1399273
 */
public enum Value {
    ACE(1, "A"), TWO(2, "2"), THREE(3, "3"), FOUR(4, "4"), FIVE(5, "5"), SIX(6, "6"), SEVEN(7, "7"),
    EIGHT(8, "8"), NINE(9, "9"), TEN(10, "10"), JACK(11, "J"), QUEEN(12, "Q"), KING(13, "K");

    private int rank;
    private String val;

    private Value(int rank, String val) {
        this.rank = rank;
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public int getRank() {
        return rank;
    }
}

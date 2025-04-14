package java_mid2.collection.compare.test;

import java.util.Objects;

public class Card implements Comparable<Card> {
    private int number;
    private String shape;

    @Override
    public int compareTo(Card c2) {
        Card c1 = this;
        if (c1.getNumber() < c2.getNumber()) {
            return -1;
        } else if (c1.getNumber() > c2.getNumber()) {
            return 1;
        }
        return getCode(c1.getShape()) < getCode(c2.getShape()) ? -1 : 1;
    }

    private int getCode(String string) {
        if (string.equals("\u2660")) {
            return 0;
        } else if (string.equals("\u2665")) {
            return 1;
        } else if (string.equals("\u2666")) {
            return 2;
        } else {
            return 3;
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Card card = (Card) object;
        return number == card.number && Objects.equals(shape, card.shape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, shape);
    }

    public Card(int number, String shape) {
        this.number = number;
        this.shape = shape;
    }

    public int getNumber() {
        return number;
    }

    public String getShape() {
        return shape;
    }

    @Override
    public String toString() {
        return number + " " + shape;
    }
}

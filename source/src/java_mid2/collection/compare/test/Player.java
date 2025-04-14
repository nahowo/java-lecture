package java_mid2.collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
    }

    private List<Card> cards = new ArrayList<>();

    public void showCard() {
        sortCard();
        System.out.print("[");
        for (int i = 0; i < cards.size(); i++) {
            System.out.print(cards.get(i).getNumber() + "(" + cards.get(i).getShape() + ")");
            if (i < cards.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public void sortCard() {
        cards.sort(null);
    }

    public int totalNumber() {
        int total = 0;
        for (Card card : cards) {
            total += card.getNumber();
        }
        return total;
    }

    public void add(Card card) {
        cards.add(card);
    }
}

package java_mid2.collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        initCard();
    }

    private void initCard() {
        String[] shapes = new String[4];
        shapes[0] = "\u2660";
        shapes[1] = "\u2665";
        shapes[2] = "\u2666";
        shapes[3] = "\u2663";

        for (String shape : shapes) {
            for (int i = 1; i < 15; i++) {
                cards.add(new Card(i, shape));
            }
        }
    }

    public void sort() {
        cards.sort(null);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public String toString() {
        return "Deck: " + cards;
    }

    public Card remove() {
        return cards.remove(0); // 인덱스 기준 제거
    }
}

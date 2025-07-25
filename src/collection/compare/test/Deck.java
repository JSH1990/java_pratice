package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        initCard();
        shuffle();
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard(){
        return cards.remove(0);
    }

    private void initCard() {
        for (int i = 0; i <= 13 ; i++) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(i, suit));
            }
        }
    }

}
